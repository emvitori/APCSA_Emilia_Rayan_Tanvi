public class CollegeConnector {
    private String College;
    private int Length;
    private String Graduate;
    private int Cost;
    private String Public;
    private String Model;
    private int Environment;
    private String Location;
    private String Certainty;
    private String Menu;
    private String EnvironmentSize;

    public void setEnvironmentSize(String UserEnvironmentSize) {
        this.EnvironmentSize = UserEnvironmentSize;
    }
    public String getEnvironmentSize() {
        return EnvironmentSize;
    }
    public void setMenu(String UserMenu) {
        this.Menu = UserMenu;
    }
    public String getMenu() {
        return Menu;
    }
    public void setCertainty(String UserCertainty) {
        this.Certainty = UserCertainty;
    }

    public String getCertainty() {
        return Certainty;
    }

    public void setCollege(String UserCollege) {
        this.College = UserCollege;
    }

    public String getCollege() {
        return College;
    }

    public void setLength(int UserLength) {
        this.Length = UserLength;
    }

    public int getLength() {
        return Length;
    }

    public void setGraduate(String UserGraduate) {
        this.Graduate = UserGraduate;
    }

    public String getGraduate() {
        return Graduate;
    }

    public void setCost(int UserCost) {
        this.Cost = UserCost;
    }

    public int getCost() {
        return Cost;
    }

    public void setPublic(String UserPublic) {
        this.Public = UserPublic;
    }   

    public String getPublic() {
        return Public;
    }

    public void setModel(String UserModel) {
        this.Model = UserModel;
    }

    public String getModel() {
        return Model;
    }

    public void setEnvironment(int UserEnvironment) {
        this.Environment = UserEnvironment;
    }
    public int getEnvironment() {
        return Environment;
    }

    public void setLocation(String UserLocation) {
        this.Location = UserLocation;
    }  

    public String getLocation() {
        return Location;
    }

    public String toString() {
        return "Your best fit would be a " + getPublic() + "school with a " + getGraduate() + "program school, that is " + getPublic() + ", has a " + getModel() + " model, and is in a " + getEnvironmentSize() + " environment.";
    }

}
