package com.stream.player.ui.screen.play
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.viewinterop.AndroidView
import androidx.media3.ui.PlayerView
import com.stream.player.player.rememberExoPlayer
import kotlinx.coroutines.delay

@Composable
fun PlayerScreen(videoUrl: String, title: String, onBack: () -> Unit) {
    val player = rememberExoPlayer(url = videoUrl)
    Box(modifier = Modifier.fillMaxSize().background(Color.Black)) {
        AndroidView(
            factory = { ctx -> PlayerView(ctx).apply { this.player = player } },
            modifier = Modifier.fillMaxSize()
        )
    }
}
