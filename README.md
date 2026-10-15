# Practical 4

这是练习 Git 合并冲突的基础 Android 项目。应用代码使用 Java 和 XML，初始界面包含两个紫色按钮。

## 打开项目

在 Android Studio 中选择 Open，打开 Practical4 文件夹，等待 Gradle Sync 完成，再运行 app。

小组名称为 Danzhou，应用名称为 GitConflictDemo-Danzhou。

小组仓库：https://github.com/jiangyifan2004/GitConflictDemo-Danzhou

## 代码说明

- MainActivity.java：onCreate 在页面启动时执行，setContentView 加载 XML 界面。
- activity_main.xml：LinearLayout 纵向排列一个 TextView 和两个 Button。
- android:backgroundTint：设置按钮背景颜色。
- match_parent：宽度与父布局相同。
- wrap_content：高度由内容决定。
- dp：用于间距；sp：用于文字大小。

本题要求修改按钮外观，不需要给按钮添加额外的业务功能。

## 两位同学如何修改

本项目按用户选择使用 GitHub，合并操作使用 Pull Request。初始提交为 03fe980，初始界面包含两个紫色按钮。

Student 1 从初始 main 创建 feature-red-button，将 activity_main.xml 中两处 #6750A4 都改为 #F44336，运行测试，提交 Change button color to red，再推送。

feature-green-button 已从同一个初始提交预留，尚未包含绿色修改。Student 2 克隆仓库后，在 Android Studio 中切换到 feature-green-button，将相同两处 #6750A4 都改为 #4CAF50，运行测试，提交 Change button color to green，再推送。绿色修改完成并提交之前，不要将更新后的 main 合并到绿色分支。

先通过 Pull Request 合并红色分支，再创建绿色分支的 Pull Request，使 GitHub 检测到冲突。

解决时在绿色分支合并最新 main，检查双方修改，确定最终颜色，删除冲突标记，构建并运行后提交 Resolve button color merge conflict。推送绿色分支，再完成对应 Pull Request。

最终颜色由小组共同决定，可以保留红色、绿色，或采用第三种方案。examples 文件夹中的 resolved-example.xml 示范一红一绿，供小组参考。red-activity_main.xml 和 green-activity_main.xml 分别是红色与绿色分支的布局示例，使用时将内容复制到 app/src/main/res/layout/activity_main.xml。

队友加入仓库后，应使用自己的 GitHub 账号提交绿色修改。保留两个功能分支、两个 Pull Request、冲突发生的证据和解决冲突的提交，作为实际协作过程的记录。
