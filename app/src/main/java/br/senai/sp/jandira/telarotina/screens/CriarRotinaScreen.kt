package br.senai.sp.jandira.telarotina.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.telarotina.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CriarRotinaScreen() {
    var titulo by remember { mutableStateOf("") }
    var descricao by remember { mutableStateOf("") }
    var hora by remember { mutableStateOf("00:00") }
    var data by remember { mutableStateOf("") }
    
    // Define Krona One font family
    val kronaOneFont = FontFamily(
        Font(R.font.krona_one_regular, FontWeight.Normal)
    )
    
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF5F5F5))
    ) {
        // Header
        TopAppBar(
            title = {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Start,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.logo_baby),
                        contentDescription = "S♥S Baby Logo",
                        modifier = Modifier
                            .size(80.dp)
                    )
                }
            },
            navigationIcon = {
                IconButton(onClick = { }) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "Voltar",
                        tint = Color.Gray
                    )
                }
            },
            actions = {
                IconButton(onClick = { }) {
                    Image(
                        painter = painterResource(id = R.drawable.notificacoes),
                        contentDescription = "S♥S Baby Logo",
                        modifier = Modifier
                            .size(50.dp)
                    )
                }
                IconButton(onClick = { }) {
                    Image(
                        painter = painterResource(id = R.drawable.perfil),
                        contentDescription = "S♥S Baby Logo",
                        modifier = Modifier
                            .size(50.dp)

                    )
                }
            },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Color.White
            )
        )
        
        // Content
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 24.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Spacer(modifier = Modifier.height(20.dp))
            
            // Title
            Text(
                text = "Crie uma\nnova Rotina",
                fontSize = 24.sp,
                fontWeight = FontWeight.Normal,
                fontFamily = kronaOneFont,
                color = Color.Black,
                lineHeight = 28.sp
            )
            
            Spacer(modifier = Modifier.height(40.dp))
            
            // Form Card
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(300.dp),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xFF6C7CE7)),
                elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(20.dp),
                    verticalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    // Título and Hora Row
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(12.dp)
                    ) {
                        // Título
                        Column(modifier = Modifier.weight(1f)) {
                            Text(
                                text = "Título",
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Normal,
                                fontFamily = kronaOneFont,
                                color = Color.White
                            )
                            Spacer(modifier = Modifier.height(4.dp))
                            OutlinedTextField(
                                value = titulo,
                                onValueChange = { titulo = it },
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(48.dp),
                                colors = OutlinedTextFieldDefaults.colors(
                                    focusedContainerColor = Color(0xFF8A94F0),
                                    unfocusedContainerColor = Color(0xFF8A94F0),
                                    focusedBorderColor = Color.Transparent,
                                    unfocusedBorderColor = Color.Transparent
                                ),
                                shape = RoundedCornerShape(24.dp)
                            )
                        }
                        
                        // Hora
                        Column(modifier = Modifier.weight(1f)) {
                            Text(
                                text = "Hora",
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Normal,
                                fontFamily = kronaOneFont,
                                color = Color.White
                            )
                            Spacer(modifier = Modifier.height(4.dp))
                            OutlinedTextField(
                                value = hora,
                                onValueChange = { hora = it },
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(48.dp),
                                colors = OutlinedTextFieldDefaults.colors(
                                    focusedContainerColor = Color(0xFF8A94F0),
                                    unfocusedContainerColor = Color(0xFF8A94F0),
                                    focusedBorderColor = Color.Transparent,
                                    unfocusedBorderColor = Color.Transparent
                                ),
                                shape = RoundedCornerShape(24.dp)
                            )
                        }
                    }
                    
                    // Descrição and Data Row
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(12.dp)
                    ) {
                        // Descrição
                        Column(modifier = Modifier.weight(1f)) {
                            Text(
                                text = "Descrição",
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Normal,
                                fontFamily = kronaOneFont,
                                color = Color.White
                            )
                            Spacer(modifier = Modifier.height(4.dp))
                            OutlinedTextField(
                                value = descricao,
                                onValueChange = { descricao = it },
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(48.dp),
                                colors = OutlinedTextFieldDefaults.colors(
                                    focusedContainerColor = Color(0xFF8A94F0),
                                    unfocusedContainerColor = Color(0xFF8A94F0),
                                    focusedBorderColor = Color.Transparent,
                                    unfocusedBorderColor = Color.Transparent
                                ),
                                shape = RoundedCornerShape(24.dp)
                            )
                        }
                        
                        // Data
                        Column(modifier = Modifier.weight(1f)) {
                            Text(
                                text = "Data",
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Normal,
                                fontFamily = kronaOneFont,
                                color = Color.White
                            )
                            Spacer(modifier = Modifier.height(4.dp))
                            OutlinedTextField(
                                value = data,
                                onValueChange = { data = it },
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(48.dp),
                                trailingIcon = {
                                    Icon(
                                        imageVector = Icons.Default.KeyboardArrowDown,
                                        contentDescription = "Selecionar data",
                                        tint = Color.White
                                    )
                                },
                                colors = OutlinedTextFieldDefaults.colors(
                                    focusedContainerColor = Color(0xFF8A94F0),
                                    unfocusedContainerColor = Color(0xFF8A94F0),
                                    focusedBorderColor = Color.Transparent,
                                    unfocusedBorderColor = Color.Transparent
                                ),
                                shape = RoundedCornerShape(24.dp)
                            )
                        }
                    }
                    
                    Spacer(modifier = Modifier.height(8.dp))
                    
                    // Add Button
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        IconButton(
                            onClick = { },
                            modifier = Modifier
                                .size(40.dp)
                                .background(
                                    Color(0xFF8A94F0),
                                    RoundedCornerShape(20.dp)
                                )
                        ) {
                            Icon(
                                imageVector = Icons.Default.Add,
                                contentDescription = "Adicionar",
                                tint = Color.White,
                                modifier = Modifier.size(24.dp)
                            )
                        }
                    }
                    
                    Spacer(modifier = Modifier.weight(1f))
                    
                    // Criar Button
                    Button(
                        onClick = { },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(40.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.White,
                            contentColor = Color.Black
                        ),
                        shape = RoundedCornerShape(20.dp)
                    ) {
                        Text(
                            text = "Criar",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Normal,
                            fontFamily = kronaOneFont
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CriarRotinaScreenPreview() {
    CriarRotinaScreen()
}
