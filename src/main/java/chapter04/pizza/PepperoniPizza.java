package chapter04.pizza;

class PepperoniPizza extends Pizza {

    public PepperoniPizza() {
        name = "뉴욕 스타일 소스와 치즈 피자";
        dough = "씬 크러스트 도우";
        sauce = "마리나라 소스";

        toppings.add("잘게 썬 페퍼로니");
    }


    @Override
    public void cut() {
        System.out.println("둥근 모양으로 피자 자르기");
    }

}
