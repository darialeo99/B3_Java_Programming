package day07_relational_operators;

public class GiftCard {
    public static void main(String[] args) {
        /*

    Task:
        declare and assign a gift card with 200
        buy 2 items.
        buy item 1 for x price and subtract from your gift card
        buy item 2 for x price and subtract from your gift card
        print the remaining balance of your gift card

        100
        40
 */
        double giftCardBalance = 200;
        double item1Price = 100;
        double item2Price = 70;
        System.out.println("In my gift card, I have $" + giftCardBalance + " balance.");
        System.out.println("Buy item 1 for $" + item1Price + " with your gift card");

        giftCardBalance = giftCardBalance - item1Price; // the same thing below
        giftCardBalance -= item1Price; // the same thing as above just using short hard operator


        System.out.println("After purchasing item 1, my gift card balance is $" + giftCardBalance);

        giftCardBalance = giftCardBalance - item2Price; // 100 - 50
        //giftCardBalance -=item2Price;
        System.out.println("After purchasing item 2, my gift card balance is $" + giftCardBalance);


    }
}
