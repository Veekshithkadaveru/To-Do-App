package com.example.to_do_app.ui.screens.task

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.to_do_app.data.models.Priority
import com.example.to_do_app.data.models.ToDoTask
import com.example.to_do_app.ui.viewmodels.SharedViewModel
import com.example.to_do_app.util.Action

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun TaskScreen(
    selectedTask: ToDoTask?,
    sharedViewModel: SharedViewModel,
    navigateToListScreen: (Action) -> Unit
) {
    Scaffold(
        topBar = {
            TaskAppBar(
                selectedTask = selectedTask,
                navigateToListScreen = navigateToListScreen
            )
        }, content = { paddingValues ->
            TaskContent(
                title = "Kotlin",
                onTitleChange = {},
                description = "Hello World",
                onDescriptionChange = {},
                priority = Priority.Low,
                onPrioritySelected = {},
                modifier = Modifier.padding(paddingValues).fillMaxSize()
            )
        }
    )
}