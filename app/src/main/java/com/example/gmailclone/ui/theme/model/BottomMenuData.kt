package com.example.gmailclone.ui.theme.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material.icons.outlined.VideoCall
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomMenuData(
    val icon: ImageVector,
    val title: String
) {
    object Mail: BottomMenuData(icon = Icons.Outlined.Menu, "Mail")
    object Meet: BottomMenuData(icon = Icons.Outlined.VideoCall, "Meet")
}