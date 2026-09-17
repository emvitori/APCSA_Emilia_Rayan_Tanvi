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
// getters and setters for all the variables
    public void setEnvironmentSize(String UserEnvironmentSize) {
        this.EnvironmentSize = UserEnvironmentSize;
    }
// getter for the EnvironmentSize variable
    public String getEnvironmentSize() {
        return EnvironmentSize;
    }
// setter for the Menu variable
    public void setMenu(String UserMenu) {
        this.Menu = UserMenu;
    }
// getter for the Menu variable
    public String getMenu() {
        return Menu;
    }
    // setter for the Certainty variable
    public void setCertainty(String UserCertainty) {
        this.Certainty = UserCertainty;
    }
// getter for the Certainty variable
    public String getCertainty() {
        return Certainty;
    }
// setter for the College variable
    public void setCollege(String UserCollege) {
        this.College = UserCollege;
    }
// getter for the College variable
    public String getCollege() {
        return College;
    }
// setter for the Length variable
    public void setLength(int UserLength) {
        this.Length = UserLength;
    }
// getter for the Length variable
    public int getLength() {
        return Length;
    }
// setter for the Graduate variable
    public void setGraduate(String UserGraduate) {
        this.Graduate = UserGraduate;
    }
// getter for the Graduate variable
    public String getGraduate() {
        return Graduate;
    }
// setter for the Cost variable
    public void setCost(int UserCost) {
        this.Cost = UserCost;
    }
// getter for the Cost variable
    public int getCost() {
        return Cost;
    }
// setter for the Public variable
    public void setPublic(String UserPublic) {
        this.Public = UserPublic;
    }   
// getter for the Public variable
    public String getPublic() {
        return Public;
    }
// setter for the Model variable
    public void setModel(String UserModel) {
        this.Model = UserModel;
    }
// getter for the Model variable
    public String getModel() {
        return Model;
    }
// setter for the Environment variable
    public void setEnvironment(int UserEnvironment) {
        this.Environment = UserEnvironment;
    }
// getter for the Environment variable
    public int getEnvironment() {
        return Environment;
        // getter for the Environment variable
    }
// setter for the Location variable
    public void setLocation(String UserLocation) {
        this.Location = UserLocation;
    }  
// getter for the Location variable
    public String getLocation() {
        return Location;
    }
// getter for the EnvironmentSize variable
    public int getEnvironmentSize() {
        return EnvironmentSize;
    }
// toString method that returns a string representation of the CollegeConnector object
    public String toString() {
        return "Your best fit would be a " + getPublic() + "school with a " + getGraduate() + "program school, that is " + getPublic() + ", has a " + getModel() + " model, and is in a " + getEnvironmentSize() + " environment.";
    }
// method that returns a string representation of the CollegeConnector object with all the variables
}
