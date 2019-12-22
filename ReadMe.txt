1:安装git后,在当前目录右键选择"git Blush"
2:输入 git init 命令
3:配置全局用户名和email
  输入以下命令语法：(global: 表示全局配置)
  user.name  后面使用github的用户名
  user.email 后面使用github的注册email
  $ git config --global user.name "Your Name"
  $ git config --global user.email "youremail@example.com"
  $ git config --list   //查看配置
  
  我的：
  $ git config --global user.name "wxg-git"
  $ git config --global user.email "39722051@qq.com"

4: 获取公私匙
   $ ssh-keygen -t rsa -C "youremail@example.com"
   我的：
   ssh-keygen -t rsa -b 4096 -C "39722051@qq.com"
   默认公私匙生成在c/user/administrator/.ssh/...

5: 在github官网登陆，在setting中 sshkey菜单添加公匙。
   
6: 输入以下命令可以测试连接是否是通的
   $ ssh -T git@github.com

The authenticity of host 'github.com (52.74.223.119)' can't be established.
RSA key fingerprint is SHA256:nThbg6kXUpJWGl7E1IGOCspRomTxdCARLviKw6E5SY8.
Are you sure you want to continue connecting (yes/no)? yes
Warning: Permanently added 'github.com,52.74.223.119' (RSA) to the list of known hosts.

Hi wxg-git! You've successfully authenticated, but GitHub does not provide shell access.

   根据提示：输入 yes

7:添加一个文件测试
  git add 文件名称  或 git add .  (.表示所有文件)

  git add .



