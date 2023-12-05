package com.example.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.isSystemInDarkTheme
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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.login.ui.theme.LightBlueWhite

// 这个注解表示这个函数是一个可组合项，可以用来创建和组合界面组件
@Composable
fun LoginScreen() {
    // Surface 是一个可组合项，用来创建一个表面，可以设置背景色、阴影、形状等
    Surface {
        // Column 是一个可组合项，用来创建一个垂直排列的布局，可以放置多个子组件。Modifier 是一个参数，用来修饰或扩充可组合项的大小、布局、行为和外观
        Column(Modifier.fillMaxSize()) {

            TopSection()

            Spacer(modifier = Modifier.height(36.dp))

            // Column 是一个可组合项，用来创建一个垂直排列的布局，可以放置多个子组件。Modifier 是一个参数，用来修饰或扩充可组合项的大小、布局、行为和外观
            Column(
                // 这是一个参数，用来修饰或扩充可组合项的大小、布局、行为和外观。它是一个 Modifier 类的对象，可以通过调用 Modifier 类的函数来创建和组合
                modifier = Modifier
                    // 这是一个 Modifier 类的函数，用来设置可组合项填充最大的可用空间
                    .fillMaxSize()
                    // 这是一个 Modifier 类的函数，用来设置可组合项的内边距，这里是设置水平方向上的内边距为 30.dp，dp 是一个单位，表示密度无关像素
                    .padding(horizontal = 30.dp)
            ) {
                // 这是一个子组件，用来创建一个登录界面的文本输入框，它有三个参数，分别是 label，trailing 和 modifier。label 是用来设置文本输入框的标签，也就是提示用户输入什么内容的文字，这里是设置为 "Email"；trailing 是用来设置文本输入框的尾部图标，也就是在文本输入框的右侧显示的文字，这里是设置为 "Fongot"；modifier 是用来修饰或扩充可组合项的大小、布局、行为和外观，这里是设置文本输入框填充最大的宽度
                LoginTextField(label = "Email", trailing = "Fongot", modifier = Modifier.fillMaxWidth())
                // 这是一个子组件，用来创建一个空白的间隔，它有一个参数，就是 modifier。这里是设置间隔的宽度为 15.dp
                Spacer(modifier = Modifier.width(15.dp))
                // 这是另一个子组件，用来创建一个登录界面的文本输入框，它的参数和上面的类似，只是 label 设置为 "Password"，trailing 设置为空字符串
                LoginTextField(label = "Password", trailing = "", modifier = Modifier.fillMaxWidth())
                // 这是另一个子组件，用来创建一个空白的间隔，它的参数和上面的类似
                Spacer(modifier = Modifier.width(15.dp))
                Button(
                    // 这是一个子组件，用来创建一个按钮，它有四个参数，分别是 modifier，onClick，colors 和 content。modifier 是用来修饰或扩充可组合项的大小、布局、行为和外观，这里是设置按钮填充最大的宽度，高度为 40.dp
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(40.dp),
                    // 这是一个参数，用来处理按钮的点击事件，这里是设置为空的 lambda 表达式，表示不做任何处理
                    onClick = { /*TODO*/ },
                    // 这是一个参数，用来设置按钮的颜色方案，这里是使用 ButtonDefaults.buttonColors() 函数，表示使用默认的按钮的颜色方案，并将 contentColor 参数设置为 LightBlueWhite，表示按钮的内容颜色为浅蓝白色
                    colors = ButtonDefaults.buttonColors(contentColor = LightBlueWhite)
                ) {
                    // 这是一个参数，用来创建一个 Text 可组合项，作为按钮的内容。Text 可组合项的 text 参数是 "Login"，style 参数是 MaterialTheme.typography.displaySmall.copy(fontWeight = FontWeight.Medium)，表示使用 Material 主题中的 displaySmall 字体样式，并复制一份，将字体的粗细设置为 Medium
                    Text(
                        text = "Login",
                        style = MaterialTheme.typography.displaySmall.copy(fontWeight = FontWeight.Medium)
                    )
                }
            }

        }
    }

}

@Composable
private fun TopSection() {
    val uiColor = if (isSystemInDarkTheme()) LightBlueWhite else Color.Black
    // Box 是一个可组合项，用来创建一个盒子，可以放置一个或多个子组件，并设置它们的对齐方式。
    // contentAlignment 是一个参数，用来设置子组件的对齐方式，这里是居中对齐
    Box(contentAlignment = Alignment.TopCenter) {
        // Image 是一个可组合项，用来创建一个图片，可以显示本地或网络的图片资源
        Image(
            // modifier 是一个参数，用来修饰或扩充可组合项的大小、布局、行为和外观。这里是设置图片填充最大宽度
            modifier = Modifier.fillMaxWidth(),
            // painter 是一个参数，用来设置图片的绘制器，可以是一个本地或网络的图片资源。这里是使用一个本地的图片资源，id 是图片的资源标识符
            painter = painterResource(id = R.drawable.shape),
            // contentDescription 是一个参数，用来设置图片的内容描述，可以用来辅助无障碍访问。这里是设置为 null，表示不提供内容描述
            contentDescription = null,
            // contentScale 是一个参数，用来设置图片的缩放模式，可以是填充、裁剪、适应等。这里是设置为填充模式，表示图片会填充整个盒子的大小
            contentScale = ContentScale.FillBounds
        )
        Row(
            modifier = Modifier.padding(top = 80.dp),
            // verticalAlignment 是一个参数，用来设置子组件的垂直对齐方式，这里是居中对齐
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                modifier = Modifier.size(42.dp),
                // painter 是一个参数，用来设置图片的绘制器，可以是一个本地或网络的图片资源。这里是使用一个本地的图片资源，id 是图片的资源标识符
                painter = painterResource(id = R.drawable.logo),
                contentDescription = stringResource(id = R.string.logo),
                // tint 是一个参数，用来设置图片的颜色，这里是设置为 uiColor，表示使用系统的主题颜色
                tint = uiColor
            )
            // Spacer 是一个可组合项，用来创建一个空白的占位符，可以设置它的大小
            Spacer(modifier = Modifier.width(15.dp))
            Column {
                Text(
                    text = stringResource(id = R.string.the_tolet),
                    // style 是一个参数，用来设置文本的样式，这里是设置为标题样式
                    style = MaterialTheme.typography.displayMedium,
                    // color 是一个参数，用来设置文本的颜色，这里是设置为 uiColor，表示使用系统的主题颜色
                    color = uiColor
                )
                Text(
                    text = stringResource(id = R.string.find_house),
                    // style 是一个参数，用来设置文本的样式，这里是设置为副标题样式
                    style = MaterialTheme.typography.displaySmall,
                    // color 是一个参数，用来设置文本的颜色，这里是设置为 uiColor，表示使用系统的主题颜色
                    color = uiColor
                )

            }
        }
        Text(
            // modifier 是一个参数，用来修饰或扩充可组合项的大小、布局、行为和外观。这里是设置文本的位置，距离顶部 10dp 的位置
            // align 是一个参数，用来设置文本的对齐方式，这里是设置为顶部居中对齐
            modifier = Modifier
                .padding(bottom = 10.dp)
                .align(Alignment.BottomCenter),
            text = stringResource(id = R.string.login),
            // style 是一个参数，用来设置文本的样式，这里是设置为标题样式
            style = MaterialTheme.typography.displayLarge,
            // color 是一个参数，用来设置文本的颜色，这里是设置为 uiColor，表示使用系统的主题颜色
            color = uiColor
        )

    }
}

@Composable
@Preview
fun GreetingPreview() {
    TopSection()
}

