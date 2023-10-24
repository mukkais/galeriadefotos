package com.example.galeriadefotos

import android.os.Bundle
import android.view.RoundedCorner
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialogDefaults.shape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.galeriadefotos.ui.theme.GaleriaDeFotosTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GaleriaDeFotosTheme {
                GaleriaDeFotos()

                }
            }
        }
    }

@Preview(showBackground = true)
@Composable
fun GaleriaDeFotos(){
    var navegador by remember { mutableStateOf(1) }
        var idImage = when(navegador){
            1-> R.drawable._50628
            2-> R.drawable.dark_horror_wallpaper_wide_free_9qfuh0puuw6xgj56
            3-> R.drawable.paranormal_spooky_face_half_water_qj7vqdini9ksl7nz
            4-> R.drawable.siren_head_kills_and_eats_yokc8w4cxq23gc45
            5-> R.drawable.wp4064088_spooky_wallpapers
              else -> R.drawable.wp6348923_4k_desktop_horror_wallpapers


        }
    Column (
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier =Modifier.fillMaxSize()
            .padding(top =150.dp))
    {
        Image(
            painter = painterResource(id = idImage),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
        )
        Row (horizontalArrangement = Arrangement.SpaceBetween,
            modifier =Modifier.fillMaxWidth()
        ){
            Button(onClick = {
                navegador=navegador -1 },

        colors = ButtonDefaults.buttonColors (Color(600, 200, 20,  90)),
                shape = RoundedCornerShape(10.dp),

                border = BorderStroke (10.dp, Color.DarkGray),

            elevation = ButtonDefaults.buttonElevation(4.dp),


                ) {
                Text(
                    text = "voltar",
                    fontSize = 20.sp
                )


            }
            Button(onClick = {navegador=navegador +1 },
                colors = ButtonDefaults.buttonColors (Color(600, 200, 20,  90)),
                shape = RoundedCornerShape(10.dp),

                border = BorderStroke (10.dp, Color.DarkGray),

                elevation = ButtonDefaults.buttonElevation(4.dp),) {
                Text(
                    text = "proximo",
                    fontSize = 20.sp
                )

            }

        }

        }

        }




