package com.example.wazitoecommerce.ui.theme.screens.location


import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.R
import com.example.wazitoecommerce.navigation.ADD_PRODUCTS_URL
import com.example.wazitoecommerce.navigation.VIEW_PRODUCTS_URL
import com.example.wazitoecommerce.ui.theme.WazitoECommerceTheme

@Composable
fun LocationScreen(navController:NavHostController) {
   Column(modifier= Modifier.fillMaxSize()){
       val mUrl = "https://www.google.com/maps/place/California+Restaurant+(Gaberone+Road)/@-1.284197,36.8245078,17z/data=!3m1!4b1!4m6!3m5!1s0x182f1101fcbaeb47:0x6fb5ee6efb0af496!8m2!3d-1.2842024!4d36.8270827!16s%2Fg%2F1tk1wf9f?entry=ttu"
       AndroidView(factory = {
           WebView(it).apply {
               layoutParams = ViewGroup.LayoutParams(
                   ViewGroup.LayoutParams.MATCH_PARENT,
                   ViewGroup.LayoutParams.MATCH_PARENT
               )
               webViewClient = WebViewClient()
               loadUrl(mUrl)
           }
       }, update = { it.loadUrl(mUrl) })



   }



}
@Composable
@Preview(showBackground = true)
fun LocationScreenPreview(){
    WazitoECommerceTheme {
        LocationScreen(navController = rememberNavController())
    }
}
