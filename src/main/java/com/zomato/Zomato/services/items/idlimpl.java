package com.zomato.Zomato.services.items;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.zomato.Zomato.entity.resta;
import com.zomato.Zomato.entity.restoResMain;

@Service
public class idlimpl implements idl {

	restoResMain rr = new restoResMain();
	
	@Override
	public restoResMain res() {
		rr.setResult(true);
		rr.setMessage("here some res for you");
	
		Map<Integer, resta> data = new HashMap();
		data.put(0, new resta(true, "https://t3.ftcdn.net/jpg/03/62/02/26/360_F_362022640_fZ6UM0JycJlFDdBiR1pYlNddKfdGvYwR.jpg", "120", "1", "Indian Masala House"));
		data.put(1, new resta(true, "https://thumbs.dreamstime.com/b/idly-sambar-served-iddli-traditional-breakfast-south-indian-households-its-very-popular-savory-dish-south-indian-41417890.jpg", "120", "2", "The Spice Factory"));
		data.put(2, new resta(true, "https://madhurasrecipe.com/wp-content/uploads/2023/10/Instant-Idli-Featured-Image.jpg", "120", "3", "Zaika"));
		data.put(3, new resta(true, "https://i0.wp.com/cookingfromheart.com/wp-content/uploads/2021/02/Andhra-Style-Idly.jpg?fit=684%2C1024&ssl=1", "120", "4", "Vintage Elegance Bistro"));
		data.put(4, new resta(true, "https://thumbs.dreamstime.com/z/idly-chutney-sambar-traditional-ethnic-south-indian-breakfast-idli-rice-cake-served-coconut-plate-lined-32459703.jpg", "120", "5", "Ahmedabadi"));
		data.put(5, new resta(true, "https://img.freepik.com/premium-photo/idly-sambar-idli-with-sambhar-green-red-chutney-popular-south-indian-breakfast_466689-29513.jpg", "120", "6", "The Classic Palate"));
		
		rr.setData(data);
		return rr;
	}
	

	@Override
	public restoResMain getCake() {
		restoResMain cak = new restoResMain();
		Map<Integer, resta> data = new HashMap();
		data.put(0, new resta(true, "https://www.thecakeroomsleicester.co.uk/wp-content/uploads/2023/05/The-Cake-Rooms-630-%C3%97-630px-630-%C3%97-600px-11-1.png", "700", "1", "Seriously Sweet Cakes"));
		data.put(1, new resta(true, "https://upload.wikimedia.org/wikipedia/commons/thumb/e/ef/Halloween_cake_with_a_jack-o%27-lantern.jpg/600px-Halloween_cake_with_a_jack-o%27-lantern.jpg", "1200", "2", "Krissy's Cake Creations"));
		data.put(2, new resta(true, "https://upload.wikimedia.org/wikipedia/commons/thumb/0/04/Pound_layer_cake.jpg/600px-Pound_layer_cake.jpg", "900", "3", "Butter Cupcakes"));
		data.put(3, new resta(true, "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3e/Q167545_and_Q2013_on_cake.jpg/600px-Q167545_and_Q2013_on_cake.jpg", "120", "4", "Vintage Elegance Bistro"));
		data.put(4, new resta(true, "https://i0.wp.com/creativecakes.ie/wp-content/uploads/2023/01/Black-Birthday-Cake-with-Gold-Drip-No.N020pppo.jpg?fit=600%2C900&ssl=1", "2500", "5", "Cheesecake & Chocolate"));
		data.put(5, new resta(true, "https://img.freepik.com/free-photo/cake_74190-2515.jpg", "500", "6", "The Classic Palate"));		
		
		cak.setData(data);
		return cak;
	}


	@Override
	public restoResMain getpizza() {
		restoResMain piz = new restoResMain();
		Map<Integer, resta> data = new HashMap();
		data.put(0, new resta(true, "https://s1.1zoom.me/prev/500/499725.jpg", "500", "6", "The Classic Palate"));
		data.put(1, new resta(true,"https://t3.ftcdn.net/jpg/01/33/61/72/360_F_133617244_dWdivRXwoLVzowl1kn3iFP9JGcuNd8n6.jpg", "700","99","Vintage Elegance Bistro"));
		data.put(2, new resta(true,"https://thumbs.dreamstime.com/b/pizza-27972212.jpg", "400","11","cheezy hub"));
		data.put(3, new resta(true,"https://myfoodstory.com/wp-content/uploads/2023/01/air-fryer-pizza-square-1.jpg", "550","22","Vintage Elegance Bistro"));
		data.put(4, new resta(true,"https://img.freepik.com/premium-photo/organic-pizza-with-vegetables-cheese-generative-ai_538159-8501.jpg", "720","33","cheezy hub"));
		
		piz.setData(data);
		return piz;
	}
	
	
	@Override
	public restoResMain getSandwich() {
		restoResMain sand = new restoResMain();
		Map<Integer, resta> data  = new HashMap();
		data.put(0, new resta(true,"https://www.shutterstock.com/image-photo/sandwich-bread-tomato-lettuce-yellow-260nw-370837082.jpg","120","12","Cafe Cofee Day"));
		data.put(1, new resta(true,"https://media.istockphoto.com/id/1397193477/photo/club-sandwich-made-with-bacon-ham-turkey-cheese-lettuce-and-tomato.jpg?s=612x612&w=0&k=20&c=fjNyxTEA0L88bqENs8_SKMnfAOyWlNPGxLIxz9nsSss=", "60","23","Vintage Elegance Bistro"));
		data.put(2, new resta(true,"https://st4.depositphotos.com/2252541/21530/i/450/depositphotos_215303682-stock-photo-delicious-ham-cheese-sandwich-lettuce.jpg", "80","143","cheezy hub"));
		data.put(3, new resta(true,"https://b.rgbimg.com/users/c/co/coolhewitt23/600/oq8v9ec.jpg", "120","25","Vintage Elegance Bistro"));
		data.put(4, new resta(true,"https://img.freepik.com/free-photo/side-view-club-sandwich-with-salted-cucumbers-lemon-olives-round-white-plate_176474-3049.jpg", "200","33","Kit Kat"));
		data.put(5, new resta(true, "https://media.istockphoto.com/id/619637254/photo/two-fresh-submarine-sandwiches.jpg?s=612x612&w=0&k=20&c=5WtuqMq6eYFognGqc7wkGUspHxcKNWr-rV2rkAegM7g=", "180", "6", "The Spice Factory"));
		
		sand.setData(data);
		
		return sand;
	}


	@Override
	public restoResMain getDosa() {
		restoResMain Dos = new restoResMain();
		Map<Integer, resta> data  = new HashMap();
		data.put(0, new resta(true,"https://www.shutterstock.com/image-photo/paper-masala-dosa-south-indian-600nw-1008144772.jpg","120","152","Indian Masala House"));
		data.put(1, new resta(true,"https://img.freepik.com/premium-photo/crispy-dosa-little-millet-dosa-black-plate-served-with-sambar-chutney-dosa_191567-1267.jpg", "160","623","Vintage Elegance Bistro"));
		data.put(2, new resta(true,"https://t3.ftcdn.net/jpg/01/86/33/72/360_F_186337209_9rbcMLu3wGCDNaEoK1jO0aNzb0pv7Xs7.jpg", "80","1433","cheezy hub"));
		data.put(3, new resta(true,"https://www.shutterstock.com/image-photo/plain-dosa-south-indian-traditional-260nw-1867962370.jpg", "120","25","Vintage Elegance Bistro"));
		data.put(4, new resta(true,"https://media.gettyimages.com/id/1124318165/photo/south-indian-meal.jpg?s=612x612&w=gi&k=20&c=RihMurYfvI68cWj2agvFTrjW8UjvyGlgfnsLcDeUc-s=", "200","33","Kit Kat"));
		data.put(5, new resta(true, "https://media.istockphoto.com/id/1024558380/photo/group-of-south-indian-food-like-masala-dosa-uttapam-idli-idly-wada-vada-sambar-appam-semolina.webp?b=1&s=170667a&w=0&k=20&c=wvD2fX-GkT1JaOwmMl8JMaKJlCklpaU6F9vXmKRFvFY=", "180", "6", "The Spice Factory"));
		
		Dos.setData(data);
		
		return Dos;
	}

}
