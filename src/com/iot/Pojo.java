package com.iot;

public class Pojo {

    @Shihu(requried = true)
    private String name;
    public String Pojo1;

    public String getPojo1() {
        return Pojo1;
    }

    public void setPojo1(String pojo1) {
        Pojo1 = pojo1;
    }

    private boolean isExist;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isExist() {
        return isExist;
    }

    public void setExist(boolean exist) {
        isExist = exist;
    }
    private void privateMethod(){
        System.out.println("私有方法");
    }
}
