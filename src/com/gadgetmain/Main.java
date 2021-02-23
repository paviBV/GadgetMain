package com.gadgetmain;

import java.util.ArrayList;
import java.util.List;

class GadgetMain{
    private String gId;
    private String gName;
    private int gCost;

    public String getgId() {
        return gId;
    }

    public void setgId(String gId) {
        this.gId = gId;
    }

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName;
    }

    public int getgCost() {
        return gCost;
    }

    public void setgCost(int gCost) {
        this.gCost = gCost;
    }

    @Override
    public String toString() {
        return "GadgetMain{" +
                "gId='" + gId + '\'' +
                ", gName='" + gName + '\'' +
                ", gCost=" + gCost +
                '}';
    }
}

public class Main {

    public static void main(String[] args) {
        List<GadgetMain> gadgetMainList = new ArrayList<>();
        GadgetMain gadgetMain = new GadgetMain();
        gadgetMain.setgId("G001");
        gadgetMain.setgName("Speaker");
        gadgetMain.setgCost(2000);
        gadgetMainList.add(gadgetMain);

        GadgetMain gadgetMain1 = new GadgetMain();
        gadgetMain1.setgId("G002");
        gadgetMain1.setgName("Whooper");
        gadgetMain1.setgCost(6000);
        gadgetMainList.add(gadgetMain1);

        GadgetMain gadgetMain2 = new GadgetMain();
        gadgetMain2.setgId("G003");
        gadgetMain2.setgName("PS3");
        gadgetMain2.setgCost(12000);
        gadgetMainList.add(gadgetMain2);

        for (int i = 0; i < gadgetMainList.size(); i++) {
            System.out.println(gadgetMainList.get(i));
        }

        System.out.println("Single");
        for (int i = 0; i < gadgetMainList.size(); i++) {
            if (gadgetMainList.get(i).getgId()=="G001") {
                System.out.println(gadgetMainList.get(i));
            }
        }

        System.out.println("update");
        for (int i = 0; i < gadgetMainList.size(); i++) {
            if (gadgetMainList.get(i).getgId()=="G002") {
                gadgetMainList.get(i).setgName("Tablet");
                gadgetMainList.get(i).setgCost(8000);
                System.out.println(gadgetMainList.get(i));
            }
        }

        System.out.println("Delete");
        for (int i = 0; i < gadgetMainList.size(); i++) {
            if (gadgetMainList.get(i).getgId()=="G001") {
              gadgetMainList.remove(i);
                System.out.println("Deleted");
            }
        }
        for (int i = 0; i < gadgetMainList.size(); i++) {
            System.out.println(gadgetMainList.get(i));
        }
    }
}
