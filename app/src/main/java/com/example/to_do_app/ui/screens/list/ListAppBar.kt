package com.example.to_do_app.ui.screens.list

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.to_do_app.R
import com.example.to_do_app.components.PriorityItem
import com.example.to_do_app.data.models.Priority
import com.example.to_do_app.ui.theme.LARGE_PADDING

@Composable
fun ListAppBar() {
    DefaultListAppBar(
        onSearchClicked = {},
        onSortClicked = {},
        onDeleteAllClicked = {}

    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DefaultListAppBar(
    onSearchClicked: () -> Unit,
    onSortClicked: (Priority) -> Unit,
    onDeleteAllClicked: () -> Unit
) {
    TopAppBar(
        title = {
            Text(
                text = "Tasks",
                color = MaterialTheme.colorScheme.inversePrimary
            )
        },
        actions = {
            ListAppBarActions(onSearchClicked = onSearchClicked,
            onSortClicked = onSortClicked,
            onDeleteAllClicked=onDeleteAllClicked)
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.primary
        )
    )
}

@Composable
fun SortAction(onSortClicked: (Priority) -> Unit) {
    var expanded by remember {
        mutableStateOf(false)
    }
    IconButton(onClick = { expanded = true }) {
        Icon(
            painter = painterResource(id = R.drawable.filter_list),
            contentDescription = "Sorted Tasks",
            tint = MaterialTheme.colorScheme.inversePrimary

        )
        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false }) {
            DropdownMenuItem(text = { PriorityItem(priority = Priority.Low) },
                onClick = { expanded = false
                onSortClicked(Priority.Low)})
            DropdownMenuItem(text = { PriorityItem(priority = Priority.High) },
                onClick = { expanded = false
                onSortClicked(Priority.High)})
            DropdownMenuItem(text = { PriorityItem(priority = Priority.None) },
                onClick = { expanded = false
                onSortClicked(Priority.None)})
        }
    }
}


@Composable
fun ListAppBarActions(
    onSearchClicked: () -> Unit,
    onSortClicked: (Priority) -> Unit,
    onDeleteAllClicked: () -> Unit
) {
    SearchAction(onSearchClicked = onSearchClicked)
    SortAction (onSortClicked = onSortClicked)
    DeleteAllAction(onDeleteAllClicked=onDeleteAllClicked)
}

@Composable
fun SearchAction(onSearchClicked: () -> Unit) {
    IconButton(
        onClick = { onSearchClicked() }
    ) {
        Icon(
            imageVector = Icons.Filled.Search,
            contentDescription = "Search Tasks",
            tint = MaterialTheme.colorScheme.inversePrimary
        )

    }
}

@Composable
fun DeleteAllAction(onDeleteAllClicked: () -> Unit) {
    var expanded by remember {
        mutableStateOf(false)
    }
    IconButton(onClick = { expanded = true }) {
        Icon(
            painter = painterResource(id = R.drawable.vertical_menu),
            contentDescription = "Sorted Tasks",
            tint = MaterialTheme.colorScheme.inversePrimary
        )
        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false }){

            DropdownMenuItem(text = {
                Text(modifier = Modifier.padding(start = LARGE_PADDING),
                    text ="Delete All" ) },
                onClick = {
                    expanded=false
                    onDeleteAllClicked()
                 })
        }
    }
}

@Composable
@Preview
fun DefaultListAppBarPreview() {
    DefaultListAppBar(
        onSearchClicked = {},
        onSortClicked = {},
        onDeleteAllClicked = {}

    )
}