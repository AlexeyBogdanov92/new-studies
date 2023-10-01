package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("user1");
        User user2 = new User("user2");
        User user3 = new User("user3");

        user1.sendMessage(user2, "Привет!");
        user1.sendMessage(user2, "Как дела?");

        user2.sendMessage(user1, "Привет! user1");
        user2.sendMessage(user1, "Я user2, всё хорошо!!");
        user2.sendMessage(user1, "А у тебя как дела?!");

        user3.sendMessage(user1, "Привет! меня зовут user3");
        user3.sendMessage(user1, "Помнишь меня?");
        user3.sendMessage(user1, "МЫ учились в одной школе");

        user1.sendMessage(user3, "Привет! user3, конечно помню!");
        user1.sendMessage(user3, "так приятно снова тебя слышать!");
        user1.sendMessage(user3, "Может увидимся наднях?!");

        user3.sendMessage(user1, "Давай, я свободен на днях!");

        MessageDatabase.showDialog(user1, user3);
    }
}
