package com.example.login

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.sp
import com.example.login.ui.theme.BlueGray
import com.example.login.ui.theme.LightBlueWhite

// 这个注解表示这个函数是一个可组合项，可以用来创建和组合界面组件
@Composable
fun LoginTextField(
    // 这是一个参数，用来修饰或扩充可组合项的大小、布局、行为和外观。它有一个默认值，就是 Modifier 类的一个空对象
    modifier: Modifier = Modifier,
    // 这是一个参数，用来设置文本输入框的标签，也就是提示用户输入什么内容的文字
    label: String,
    // 这是一个参数，用来设置文本输入框的尾部图标，也就是在文本输入框的右侧显示的文字
    trailing: String
) {

    // 这是一个变量，用来根据系统的主题模式来设置界面的颜色，如果是暗黑模式，就用浅蓝白色，否则就用黑色
    val uiColor = if (isSystemInDarkTheme()) LightBlueWhite else BlueGray

    // 这是一个注解，用来表示这个函数使用了一个实验性的 Material 3 的 API，即 TextField，它可能会在未来发生变化或被移除。如果不加这个注解，就会出现一个错误提示
    @OptIn(ExperimentalMaterial3Api::class)
    TextField(
        // 将 modifier 参数作为 TextField 的 modifier 参数，用来修饰或扩充 TextField 的大小、布局、行为和外观
        modifier = modifier,
        // 设置 TextField 的 value 参数，用来显示和更新文本输入框的内容和状态。这里是设置为空字符串，表示没有输入任何内容
        value = "",
        // 设置 TextField 的 onValueChange 参数，用来处理文本输入框的内容变化事件。这里是设置为空的 lambda 表达式，表示不做任何处理
        onValueChange = {},
        label = {
            // 设置 TextField 的 label 参数，用来创建一个 Text 可组合项，作为文本输入框的标签。Text 可组合项的 text 参数是 label 参数，style 参数是 MaterialTheme.typography.headlineLarge，表示使用 Material 主题中的 headlineLarge 字体样式，color 参数是 uiColor 变量，表示使用界面的颜色
            Text(text = label, style = MaterialTheme.typography.headlineLarge, color = uiColor, fontSize = 20.sp)
        },
        // 设置 TextField 的 colors 参数，用来设置文本输入框的颜色方案。这里是使用 TextFieldDefaults.outlinedTextFieldColors() 函数，表示使用默认的带边框的文本输入框的颜色方案
        colors = TextFieldDefaults.outlinedTextFieldColors(),
        // 设置 TextField 的
        trailingIcon = {
            // 设置 TextField 的 trailingIcon 参数，用来创建一个 Text 可组合项，作为文本输入框的尾部图标。Text 可组合项的 text 参数是 trailing 参数，style 参数是 MaterialTheme.typography.displaySmall.copy(fontWeight = FontWeight.Medium)，表示使用 Material 主题中的 displaySmall 字体样式，并复制一份，将字体的粗细设置为 Medium，color 参数是 uiColor 变量，表示使用界面的颜色
            Text(
                text = trailing,
                style = MaterialTheme.typography.displaySmall.copy(fontWeight = FontWeight.Medium),
                color = uiColor,
                fontSize = 20.sp
            )
        }
    )

}
