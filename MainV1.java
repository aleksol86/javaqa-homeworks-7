public class MainV1 {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int priceTicket  = 5200;
        int milesQuantity = service.calculate(priceTicket);
        System.out.println(milesQuantity);
    }
}