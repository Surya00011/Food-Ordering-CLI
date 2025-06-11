package com.surya;

public class Noodles {

    private String typeOfNoodles;
    private  int chickenNoodlesStock=10;
    private  int eggNoodlesStock=10;
    private  int plainNoodlesStock=10;

    public String orderNoodles(String typeOfNoodles,int quantity){
        int prize =100;
        if(typeOfNoodles.equalsIgnoreCase("chicken noodles")){
            if(chickenNoodlesStock==0) return "Out of Stock";
            else if(quantity<=chickenNoodlesStock){
                chickenNoodlesStock= chickenNoodlesStock-quantity;
            }else if(quantity>chickenNoodlesStock){
                return "Only "+chickenNoodlesStock+" available";
            }
            prize+=40;
            this.typeOfNoodles=typeOfNoodles;
        }
        else if(typeOfNoodles.equalsIgnoreCase("egg noodles")){
            if(eggNoodlesStock==0) return "Out of Stock";
            else if(quantity<=eggNoodlesStock){
                eggNoodlesStock= eggNoodlesStock-quantity;
            }else if(quantity>eggNoodlesStock){
                return "Only "+eggNoodlesStock+" available";
            }
            prize+=20;
            this.typeOfNoodles=typeOfNoodles;
        }else {
            if(plainNoodlesStock==0) return "Out of Stock";
            else if(quantity<=plainNoodlesStock){
                plainNoodlesStock=plainNoodlesStock-quantity;
            }else if(quantity>plainNoodlesStock){
                return "Only "+plainNoodlesStock+" available";
            }
            this.typeOfNoodles=typeOfNoodles;
        }
        return getBill(prize,this.typeOfNoodles,quantity) + " Enjoy your meal..!";
    }
    public String[] getTypesOfNoodles(){
        return new String[]{"Chicken Noodles","Egg Noodles","Plain noodles"};
    }
    private String getBill(int prize,String typeOfNoodles,int quantity) {
        return "Here is your bill for "+typeOfNoodles+" x "+quantity+ " Rs:"+ prize*quantity;
    }

}
