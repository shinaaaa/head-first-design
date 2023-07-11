package chapter09;

public class MenuTestDrive {
    public static void main(String[] args) {

        MenuComponent dinerMenu = new Menu("객체마을 식당 메뉴", "저녁 메뉴");
        MenuComponent cafeMenu = new Menu("객체마을 식당 메뉴", "커피 메뉴");
        MenuComponent allMenus = new Menu("전체 메뉴", "전체 메뉴");

        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        dinerMenu.add(new MenuItem("채식주의자용 BLT", "통밀 위에 콩고기 베이컨, 상추, 토마토를 얹은 메뉴", true, 2.99));
        dinerMenu.add(new MenuItem("BLT", "통밀 위에 베이컨, 상추, 토마토를 얹은 메뉴", false, 2.99));
        dinerMenu.add(new MenuItem("오늘의 스프", "감자 샐러드를 곁들인 오늘의 스프", false, 3.29));

        cafeMenu.add(new MenuItem("베지 버거와 에어 프라이", "통밀빵, 상추, 토마토, 감자 튀김이 첨가됨 베지 버거", true, 3.99));


        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}
