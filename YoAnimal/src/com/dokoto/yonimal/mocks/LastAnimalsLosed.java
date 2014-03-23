package com.dokoto.yonimal.mocks;

import com.dokoto.yoanimal.R;
import com.dokoto.yoanimal.model.Animal;

public class LastAnimalsLosed
{
	public static Animal[] fakeHttpGET()
	{
		Animal[] animals = new Animal[14];
		
		animals[0] = new Animal();
		animals[0].name = "Jeronimo";
		animals[0].last_place = "Visto hace 10 min";
		animals[0].last_time = "en Avda. Portugal 71";					
		animals[0].fake_photo = R.drawable.fake_cat_1;

		animals[1] = new Animal();
		animals[1].name = "Rigoberto";
		animals[1].last_place = "Visto hace 2 horas";
		animals[1].last_time = "en Parque Atenas";							
		animals[1].fake_photo = R.drawable.fake_cat_2;

		animals[2] = new Animal();
		animals[2].name = "Rocky";
		animals[2].last_place = "Visto hace 6 horas";
		animals[2].last_time = "en Lago Casa Campo";								
		animals[2].fake_photo = R.drawable.fake_dog_1;

		animals[3] = new Animal();
		animals[3].name = "Yambo";
		animals[3].last_place = "Visto hace 2 dias";
		animals[3].last_time = "en C\\ Caramuel 12";							
		animals[3].fake_photo = R.drawable.fake_dog_2;

		animals[4] = new Animal();
		animals[4].name = "Macumba";
		animals[4].last_place = "Visto hace 4 dias";
		animals[4].last_time = "en Metro Oporto";									
		animals[4].fake_photo = R.drawable.fake_parrot_1;
		
		animals[5] = new Animal();
		animals[5].name = "Piolin";
		animals[5].last_place = "Visto hace 15 dias";
		animals[5].last_time = "en Plaza España";								
		animals[5].fake_photo = R.drawable.fake_parrot_2;
		
		animals[6] = new Animal();
		animals[6].name = "Trueno";
		animals[6].last_place = "Visto hace 20 dias";
		animals[6].last_time = "en Parque Aluche";					
		animals[6].fake_photo = R.drawable.fake_falcon_1;

		animals[7] = new Animal();
		animals[7].name = "Rain";
		animals[7].last_place = "Visto hace 1 mes";
		animals[7].last_time = "en C\\ Recoletos, 21";							
		animals[7].fake_photo = R.drawable.fake_falcon_2;

		animals[8] = new Animal();
		animals[8].name = "Casa Blanca";
		animals[8].last_place = "Visto hace 2 meses";
		animals[8].last_time = "en cerca Corte ingles Gran Via";								
		animals[8].fake_photo = R.drawable.fake_hourse_1;

		animals[9] = new Animal();
		animals[9].name = "Pedro el Grande";
		animals[9].last_place = "Visto hace 5 meses";
		animals[9].last_time = "en A42 Km 25";							
		animals[9].fake_photo = R.drawable.fake_hourse_2;

		animals[10] = new Animal();
		animals[10].name = "Manolo";
		animals[10].last_place = "Visto hace 8 meses";
		animals[10].last_time = "en Casa de Campo, Torrelodones";									
		animals[10].fake_photo = R.drawable.fake_monkey_1;
		
		animals[11] = new Animal();
		animals[11].name = "Mogambo";
		animals[11].last_place = "Visto hace 12 meses";
		animals[11].last_time = "en retiro cerca del lago";								
		animals[11].fake_photo = R.drawable.fake_monkey_2;		
		
		animals[12] = new Animal();
		animals[12].name = "Cosita";
		animals[12].last_place = "Visto hace 1 año";
		animals[12].last_time = "en Metro Plaza España";									
		animals[12].fake_photo = R.drawable.fake_uron_1;
		
		animals[13] = new Animal();
		animals[13].name = "Cuambo";
		animals[13].last_place = "Visto hace 2 años";
		animals[13].last_time = "en Metro retiro";								
		animals[13].fake_photo = R.drawable.fake_uron_2;				
		
		return animals;
	}
}
