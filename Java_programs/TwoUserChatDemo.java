public class TwoUserChatDemo{
    public static void main(String[] args) throws Exception{
        ChatUser u1 = new ChatUser("Raj");
        ChatUser u2 = new ChatUser("Yash");

        u1.setPriority(Thread.MAX_PRIORITY);
        u2.setPriority(Thread.MIN_PRIORITY);

        u1.start();
        u2.start();

        System.out.println("Raj alive?: "+u1.isAlive() +"\n");

        Thread.sleep(1000);
        u2.pauseChat();
        System.out.println("\nYash paused.\n");

        Thread.sleep(1000);
        u2.resumeChat();
        System.out.println("\nYash was resumed.\n");

        Thread.sleep(1000);
        u1.stopChat();
        System.out.println("\nRaj is stopped.\n");
        System.out.println("Raj alive?: "+u1.isAlive() +"\n");

        u1.join();
        u2.join();

        System.out.println("\nRaj alive after join?: " + u1.isAlive());
        System.out.println("\nYash alive after join?: " + u2.isAlive());
        System.out.println("Chat Ended.");
    }
}
class ChatUser extends Thread{
    private volatile boolean paused = false;
    private volatile boolean running = true;

    ChatUser(String name){
        super(name);
    }
    public void run(){
        int i = 1;
        while(running && i<=5){
            if(paused == false){
                System.out.println(getName()+" says: Message-"+i);
                i++;
                try{Thread.sleep(500);}catch(Exception e){}
            }
        }
        System.out.println("\n" +getName()+ " Finished chatting.");
    }
    public void pauseChat() {paused = true;}
    public void resumeChat() {paused = false;}
    public void stopChat() {running = false;}
}