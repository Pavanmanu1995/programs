package assignment4;

public class coffeeShop {
String name;
String mobileNo;
double feedbackRating;
public coffeeShop() {
	super();
}
public coffeeShop(String name, String mobileNo, double feedbackRating) {
	super();
	this.name = name;
	this.mobileNo = mobileNo;
	this.feedbackRating = feedbackRating;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMobileNo() {
	return mobileNo;
}
public void setMobileNo(String mobileNo) {
	this.mobileNo = mobileNo;
}
public double getFeedbackRating() {
	return feedbackRating;
}
public void setFeedbackRating(double feedbackRating) {
	this.feedbackRating = feedbackRating;
}

}
