package com.example.wazitoecommerce.ui.theme.screens.staff


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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
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
import androidx.compose.ui.draw.clip
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
import org.w3c.dom.Text

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StaffScreen(navController:NavHostController) {
    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .paint(
                painterResource(id = R.drawable.bru6),
                contentScale = ContentScale.FillBounds
            )
            .fillMaxSize(),
    )
    {
        //TopAppBar
        TopAppBar(title = { Text(text = "Our Chefs", fontSize = 30.sp, color = Color.White) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Black),
            navigationIcon = {
                IconButton(
                    onClick = {
                        navController.navigate(HOME_URL)

                    },
                ) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "arrowback",
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
        //end of topappbar
        Spacer(modifier = Modifier.height(10.dp))


        //card 1
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
        ) {
            Row {

                    Image(
                        painter = painterResource(id = R.drawable.c2),
                        contentDescription = "chef",
                        modifier = Modifier
                            .size(100.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop
                    )


                Spacer(modifier = Modifier.width(6.dp))
                Column (
                ){
                    Spacer(modifier = Modifier.height(15.dp))

                    Text(text = "John Doe")
                    Text(text = "Head Chef")
                    Text(text = "6Yrs Experience")
                }

            }


        }
        //end of card
        Spacer(modifier = Modifier.height(15.dp))

        //card 2
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
        ) {
            Row {

                    Image(
                        painter = painterResource(id = R.drawable.c3),
                        contentDescription = "chef",
                        modifier = Modifier
                            .size(100.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop
                    )


                Spacer(modifier = Modifier.width(6.dp))
                Column (
                ){
                    Spacer(modifier = Modifier.height(15.dp))

                    Text(text = "Yang Maximilan")
                    Text(text = "Grill Chef")
                    Text(text = "4Yrs Experience")
                }

            }


        }
        //end of card
        Spacer(modifier = Modifier.height(15.dp))

        //card 3
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
        ) {
            Row {
                    Image(
                        painter = painterResource(id = R.drawable.c5),
                        contentDescription = "chef",
                        modifier = Modifier
                            .size(100.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop
                    )


                Spacer(modifier = Modifier.width(5.dp))
                Column (
                ){
                    Spacer(modifier = Modifier.height(15.dp))

                    Text(text = "Alexandra Lelly")
                    Text(text = "Sous Chef")
                    Text(text = "4Yrs Experience")
                }

            }

        }

        //end of card
        Spacer(modifier = Modifier.height(15.dp))

        //card 4
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
        ) {
            Row {
                    Spacer(modifier = Modifier.height(2.dp))
                    Image(
                        painter = painterResource(id = R.drawable.c1),
                        contentDescription = "chef",
                        modifier = Modifier
                            .size(100.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop
                    )


                Spacer(modifier = Modifier.width(5.dp))
                Column (
                ){
                    Spacer(modifier = Modifier.height(15.dp))

                    Text(text = "Tiam Ken")
                    Text(text = "Pantry Chef")
                    Text(text = "5Yrs Experience")
                }


            }


        }
        //end of card
        Spacer(modifier = Modifier.height(15.dp))
        //card 4
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
        ) {
            Row {

                    Spacer(modifier = Modifier.height(2.dp))
                    Image(
                        painter = painterResource(id = R.drawable.c4),
                        contentDescription = "chef",
                        modifier = Modifier
                            .size(100.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop
                    )


                Spacer(modifier = Modifier.width(5.dp))
                Column (
                ){
                    Spacer(modifier = Modifier.height(15.dp))

                    Text(text = "Lucy Ann")
                    Text(text = "Vegetable Chef")
                    Text(text = "3Yrs Experience")
                }

            }

        }
        //end of card
        Spacer(modifier = Modifier.height(15.dp))

        Card(modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)) {
            Row {

                    Spacer(modifier = Modifier.height(2.dp))
                    Image(painter = painterResource(id = R.drawable.chef4),
                        contentDescription = "chef",
                        modifier = Modifier
                            .size(100.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop
                    )

                Spacer(modifier = Modifier.width(5.dp))
                Column (
                ){

                    Spacer(modifier = Modifier.height(15.dp))
                    Text(text = "Irenne Wonder")
                    Text(text = "Pastry Chef")
                    Text(text = "2Yrs Experience")
                }

            }



        }
        //end of card
        Spacer(modifier = Modifier.height(15.dp))

        Card(modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)) {
            Row {

                    Spacer(modifier = Modifier.height(2.dp))
                    Image(painter = painterResource(id = R.drawable.chef3),
                        contentDescription = "chef",
                        modifier = Modifier
                            .size(100.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop
                    )

                Spacer(modifier = Modifier.width(5.dp))
                Column (
                ){
                    Spacer(modifier = Modifier.height(15.dp))

                    Text(text = "Patience Okoth")
                    Text(text = "Sauce Chef")
                    Text(text = "4Yrs Experience")
                }

            }



        }



    }



}












@Composable
@Preview(showBackground = true)
fun StaffScreenPreview(){
    WazitoECommerceTheme {
        StaffScreen(navController = rememberNavController())
    }

}
