package com.example.wazitoecommerce.ui.theme.screens.meal


import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.R
import com.example.wazitoecommerce.data.AuthViewModel
import com.example.wazitoecommerce.navigation.HOME_URL
import com.example.wazitoecommerce.navigation.LOGIN_URL
import com.example.wazitoecommerce.navigation.SIGNUP_URL
import com.example.wazitoecommerce.ui.theme.WazitoECommerceTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MealScreen(navController:NavHostController){
    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .paint(
                painterResource(id = R.drawable.bru6),
                contentScale = ContentScale.FillBounds
            )
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    )
    {

        Column(modifier = Modifier.fillMaxSize()) {
            //TopAppBar
            TopAppBar(title ={Text(text = "Sushi Meals", color = Color.White)} ,
                colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Black),
                navigationIcon = {
                    IconButton(onClick = {
                        navController.navigate(HOME_URL)

                    },
                    ) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription ="arrowback",
                            tint = Color.White
                        )
                    }
                },
                actions = {

                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "menu",
                        tint = Color.White
                    )

                }


            )
            Spacer(modifier = Modifier.height(10.dp))
            //end of topappbar
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp),
                contentAlignment = Alignment.Center
            ) {
                Image(painter = painterResource(id = R.drawable.ssss7) ,
                    contentDescription = "ssss",
                    modifier = Modifier.fillMaxWidth(),
                    contentScale = ContentScale.Crop
                )
                Text(text = "Enjoy Your Favourite Food",
                    fontSize = 40.sp,
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold
                )
            }
            //end of box
            Spacer(modifier = Modifier.height(10.dp))
            //searchbar
            var search by remember { mutableStateOf("") }

            OutlinedTextField(
                value =search,
                onValueChange = {search = it},
                placeholder = { Text(text = "All foods", color = Color.White)},
                leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "search icon")},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 20.dp),
                keyboardOptions = KeyboardOptions( keyboardType= KeyboardType.Text)

            )
            Spacer(modifier = Modifier.height(10.dp))
            //end of searchbar
            Text(text = "Mostly searched meals ", fontSize = 20.sp, color = Color.White, fontWeight = FontWeight.ExtraBold,modifier = Modifier.padding(start = 20.dp))
            Spacer(modifier = Modifier.height(10.dp))
            //Row1
            Row(modifier = Modifier
                .verticalScroll(rememberScrollState())
                .horizontalScroll(rememberScrollState())) {
                //card 1
                Card(modifier = Modifier
                    .width(150.dp)
                    .height(150.dp)) {
                    Column {
                        Box(modifier = Modifier
                            .fillMaxWidth()
                            .height(120.dp),
                            contentAlignment = Alignment.Center) {
                            Image(painter = painterResource(id = R.drawable.ssss8),
                                contentDescription ="ssss8",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop
                            )

                        }
                        Text(text = "Shrimp",fontSize = 12.sp, fontWeight = FontWeight.ExtraBold,modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center)


                    }
                }
                //end of card
                Spacer(modifier = Modifier.width(12.dp))
                //card 2
                Card(modifier = Modifier
                    .width(150.dp)
                    .height(150.dp)) {
                    Column {
                        Box(modifier = Modifier
                            .fillMaxWidth()
                            .height(120.dp),
                            contentAlignment = Alignment.Center) {
                            Image(painter = painterResource(id = R.drawable.ssss5),
                                contentDescription ="ssss5",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop
                            )

                        }
                        Text(text = "Tuna Steak",fontSize = 12.sp, fontWeight = FontWeight.ExtraBold,modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center)


                    }
                }
                //end of card
                Spacer(modifier = Modifier.width(12.dp))
                //card 3
                Card(modifier = Modifier
                    .width(150.dp)
                    .height(150.dp)) {
                    Column {
                        Box(modifier = Modifier
                            .fillMaxWidth()
                            .height(120.dp),
                            contentAlignment = Alignment.Center) {
                            Image(painter = painterResource(id = R.drawable.ssss9),
                                contentDescription ="ssss9",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop
                            )

                        }
                        Text(text = "Parmesan",fontSize = 12.sp, fontWeight = FontWeight.ExtraBold,modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center)


                    }
                }
                //end of card
                Spacer(modifier = Modifier.width(12.dp))
                //card 4
                Card(modifier = Modifier
                    .width(150.dp)
                    .height(150.dp)) {
                    Column {
                        Box(modifier = Modifier
                            .fillMaxWidth()
                            .height(120.dp),
                            contentAlignment = Alignment.Center) {
                            Image(painter = painterResource(id = R.drawable.ssss4),
                                contentDescription ="ssss4",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop
                            )

                        }
                        Text(text = "Steak",fontSize = 12.sp, fontWeight = FontWeight.ExtraBold,modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center)


                    }
                }
                //end of card
            }
            Spacer(modifier = Modifier.height(12.dp))
            //Row2
            Row(modifier = Modifier
                .verticalScroll(rememberScrollState())
                .horizontalScroll(rememberScrollState())) {
                //card 1
                Card(modifier = Modifier
                    .width(150.dp)
                    .height(150.dp)) {
                    Column {
                        Box(modifier = Modifier
                            .fillMaxWidth()
                            .height(120.dp),
                            contentAlignment = Alignment.Center) {
                            Image(painter = painterResource(id = R.drawable.food11),
                                contentDescription ="food11",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop
                            )

                        }
                        Text(text = "Shepherds Pie",fontSize = 12.sp, fontWeight = FontWeight.ExtraBold,modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center)


                    }
                }
                //end of card
                Spacer(modifier = Modifier.width(12.dp))
                //card 2
                Card(modifier = Modifier
                    .width(150.dp)
                    .height(150.dp)) {
                    Column {
                        Box(modifier = Modifier
                            .fillMaxWidth()
                            .height(120.dp),
                            contentAlignment = Alignment.Center) {
                            Image(painter = painterResource(id = R.drawable.food2),
                                contentDescription ="food2",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop
                            )

                        }
                        Text(text = "Cheese Stick",fontSize = 12.sp, fontWeight = FontWeight.ExtraBold,modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center)


                    }
                }
                //end of card
                Spacer(modifier = Modifier.width(12.dp))
                //card 3
                Card(modifier = Modifier
                    .width(150.dp)
                    .height(150.dp)) {
                    Column {
                        Box(modifier = Modifier
                            .fillMaxWidth()
                            .height(120.dp),
                            contentAlignment = Alignment.Center) {
                            Image(painter = painterResource(id = R.drawable.food3),
                                contentDescription ="food3",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop
                            )

                        }
                        Text(text = "Hamburgers",fontSize = 12.sp, fontWeight = FontWeight.ExtraBold,modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center)

                    }



                }
                //end of card
                Spacer(modifier = Modifier.width(12.dp))
                //card 4
                Card(modifier = Modifier
                    .width(150.dp)
                    .height(150.dp)) {
                    Column {
                        Box(modifier = Modifier
                            .fillMaxWidth()
                            .height(120.dp),
                            contentAlignment = Alignment.Center) {
                            Image(painter = painterResource(id = R.drawable.food4),
                                contentDescription ="food4",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop
                            )

                        }
                        Text(text = "Waffle",fontSize = 12.sp, fontWeight = FontWeight.ExtraBold,modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center)


                    }
                }
                //end of card
            }
            Spacer(modifier = Modifier.height(20.dp))
            Text(text = "All foods are available", fontSize = 30.sp,
                fontFamily = FontFamily.Cursive, color = Color.White, modifier = Modifier.padding(start = 40.dp))

        }


    }

}



@Composable
@Preview(showBackground = true)
fun MealScreenPreview(){
    WazitoECommerceTheme {
        MealScreen(navController = rememberNavController())
    }
}