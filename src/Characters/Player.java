package Characters;

public class Player extends Person {
    private int baseHP, baseDef, baseMP, baseAtk, HP, MP, def, atk, xLoc, yLoc;

    public Player(){
        xLoc = 0;
        yLoc = 0;
        baseHP = 100;
        baseMP = 15;
        baseAtk = 30;
        baseDef = 30;
        HP = baseHP;
        MP = baseMP;
        atk = baseAtk;
        def = baseDef;
    }

    public void normalize(){
        HP = baseHP;
        MP = baseMP;
        atk = baseAtk;
        def = baseDef;
    }

    public int getXLoc(){
        return xLoc;
    }

    public int getYLoc(){
        return yLoc;
    }

    public void move(int x, int y){
        xLoc += x;
        yLoc += y;
    }
}
