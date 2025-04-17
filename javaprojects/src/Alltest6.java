public class Alltest6 {
    public static void main(String[] args) {
        makeAndShuffleDeck();
    }
    //写一个简易版的斗地主游戏，要求：只完成做牌（存储54张牌）和洗牌的功能
    public static void makeAndShuffleDeck() {
        String[] suits = {"♠", "♥", "♣", "♦"};
        String[] ranks = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
        java.util.List<String> deck = new java.util.ArrayList<>();
        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(suit + rank);
            }
        }
        deck.add("小王");
        deck.add("大王");
        java.util.Collections.shuffle(deck);
        System.out.println(deck);
    }
}
