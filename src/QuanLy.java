import java.util.ArrayList;

public class QuanLy {
    ArrayList<CanBo> canBos = new ArrayList<>();

    public void create(CanBo canBo){
        canBos.add(canBo);
    }

    public void read(){
        for (CanBo canBo: canBos){
            System.out.println(canBo.toString());
        }
    }

    public void search(String name){
        for (CanBo canBo: canBos){
            if (canBo.getHoVaTen().equals(name)){
                System.out.println(canBo.toString());
            }
        }
    }


}
