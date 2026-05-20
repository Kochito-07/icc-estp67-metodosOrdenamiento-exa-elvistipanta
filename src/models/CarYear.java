package models;

public class CarYear extends CarModel{
  private int year;
  private boolean isValid;

  public CarYear(String brandName, CarModel[] models, String modelName, CarYear[] years, int year, boolean isValid) {
    super(brandName, models, modelName, years);
    this.year = year;
    this.isValid = isValid;
  }
  public int getYear() {
    return year;
  }
  public void setYear(int year) {
    this.year = year;
  }
  public boolean getIsValid() {
    return isValid;
  }
  public void setValid(boolean isValid) {
    this.isValid = isValid;
  }
  @Override
  public String toString() {
    return "CarYear [year=" + year + ", isValid=" + isValid + "]";
  }

  

}
