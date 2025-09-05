def add_event(queue, next_id):
    desc = input("Enter event description: ").strip()
    if desc == "":
        print("Empty description — not added.")
        return next_id
    evt = {"id": next_id, "desc": desc}
    queue.append(evt)
    print("Added event id =", next_id)
    return next_id + 1

def process_next(queue):
    if not queue:
        print("No events to process.")
        return
    evt = queue.pop(0)  # FIFO
    print("Processed: Event id =", evt["id"], ",Description =", evt["desc"])

def display_pending(queue):
    if not queue:
        print("No pending events.")
        return
    print("Pending events (oldest first) - total:", len(queue))
    for idx, evt in enumerate(queue, start=1):
        print(f" {idx}. Event id = {evt['id']} | Description = {evt['desc']}")

def cancel_event(queue):
    eid = int(input("Enter event id to cancel: ").strip())
    for i, evt in enumerate(queue):
        if evt["id"] == eid:
            queue.pop(i)
            print("Canceled event id =", eid)
            return
    print("Event id", eid, "not found or already processed.")

def main():
    queue = []
    next_id = 1
    while True:
        print("\n1. Add an Event.")
        print("2. Process the Next Event.")
        print("3. Display Pending Events.")
        print("4. Cancel an Event.")
        print("5. Exit.")
        choice = input("Enter your choice (1-5): ").strip()
        print()
        if choice == "1":
            next_id = add_event(queue, next_id)
        elif choice == "2":
            process_next(queue)
        elif choice == "3":
            display_pending(queue)
        elif choice == "4":
            cancel_event(queue)
        elif choice == "5":
            print("Exited.")
            break
        else:
            print("Invalid choice. Enter 1-5.")
            
main()