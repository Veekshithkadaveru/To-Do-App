package com.example.to_do_app.data.models

import androidx.compose.ui.graphics.Color
import com.example.to_do_app.ui.theme.HighPriorityColor
import com.example.to_do_app.ui.theme.LowPriorityColor
import com.example.to_do_app.ui.theme.MediumPriorityColor
import com.example.to_do_app.ui.theme.NonePriorityColor

enum class Priority(val color: Color) {
    High(HighPriorityColor),
    Medium(MediumPriorityColor),
    Low(LowPriorityColor),
    None(NonePriorityColor)
}