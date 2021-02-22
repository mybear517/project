package functionpack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionDemo {

	public static void main(String[] args) {
          
	       List<User> allUsers = Arrays.asList(
	    		new User(100,"Phil","New York"),
	    		new User(102,"Harish","New Delhi"),
	    		new User(103,"John","London"),
	    		new User(104,"John","Tampa"),
	    		new User(101,"Phil","New York"));
	    
	    Function<User, String> extractNames = e -> { return e.getName(); };
	    List<String> allNames = convertUsers(allUsers, extractNames);
	    allNames.forEach(System.out::println);
	    
	    Function<User, String> extractCities = e -> { return e.getCity(); };
	    List<String> allCities = convertUsers(allUsers, extractCities);
	    allCities.forEach(System.out::println);
	    
       Predicate<User> filterByCity = user -> user.getCity().equals("New York");
       List<User> filteredListByCity = filterByCity(allUsers, filterByCity);
       filteredListByCity.forEach(System.out::println);
	}
	public static List<String> convertUsers(List<User> allUsers, Function<User, String> function) {
		List<String> userList = new ArrayList<>();
		 for(User user : allUsers) {
			 userList.add(function.apply(user));
		 }
		 return userList;
	}
	
	public static List<User> filterByCity(List<User> allUsers, Predicate<User> predicate) {
		  List<User> filteredList = new ArrayList<User>();
		  for(User user : allUsers) {
			  filteredList.add(user);
		  }
		  return filteredList;
	}

}
