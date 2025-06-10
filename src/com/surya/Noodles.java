package com.surya;

public class Noodles {
    private int prize = 100;
    private String typeOfNoodles;

    public String orderNoodles(String typeOfNoodles){
        if(typeOfNoodles.equalsIgnoreCase("chicken noodles")){
            this.prize+=40;
            this.typeOfNoodles=typeOfNoodles;
        }
        else if(typeOfNoodles.equalsIgnoreCase("egg noodles")){
            this.prize+=20;
            this.typeOfNoodles=typeOfNoodles;
        }else {
            this.typeOfNoodles=typeOfNoodles;
        }
        return getBill(this.prize,this.typeOfNoodles) + " Enjoy your meal..!";
    }
    public String[] getTypesOfNoodles(){
        return new String[]{"Chicken Noodles","Egg Noodles","Plain noodles"};
    }
    private String getBill(int prize,String typeOfNoodles) {
        return "Here is your bill for "+typeOfNoodles+" Rs:"+ prize;
    }
}
