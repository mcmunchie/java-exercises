package LinkedQueue;

public class Main {
  public static void main(String[] args) {
    LinkedQueue queue = new LinkedQueue();

    // Add 4 songs to playlist
    String[] songs = { "Break your rules by The Boyz", "Running Through the Night by Seori",
        "Thursday's Child Has Far To Go by TOMORROW X TOGETHER", "Dimple by BTS" };

    for (String s : songs) {
      queue.enqueue(s);
    }

    // Print out playlist contents
    System.out.println("\nSongs added to playlist: ");
    System.out.println(queue);

    // Peek at current song
    System.out.println("Currently playing... " + queue.peek());

    // Remove 2 songs
    System.out.println("Removing songs.");
    queue.dequeue();
    queue.dequeue();
    // Print out playlist contents again
    System.out.println("Music playlist: ");
    System.out.println(queue);

    // Add new song to playlist
    System.out.println("Adding new music to playlist: ");
    queue.enqueue("DARARI by TREASURE");
    // Print out playlist contents again
    System.out.println("Music playlist: ");
    System.out.println(queue);

    // Check number of songs in playlist
    System.out.println("Checking playlist content.");
    System.out.println("Music playlist contains " + queue.size() + " songs.");
  }
}
