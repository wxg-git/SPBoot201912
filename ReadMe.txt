1:��װgit��,�ڵ�ǰĿ¼�Ҽ�ѡ��"git Blush"
2:���� git init ����
3:����ȫ���û�����email
  �������������﷨��(global: ��ʾȫ������)
  user.name  ����ʹ��github���û���
  user.email ����ʹ��github��ע��email
  $ git config --global user.name "Your Name"
  $ git config --global user.email "youremail@example.com"
  $ git config --list   //�鿴����
  
  �ҵģ�
  $ git config --global user.name "wxg-git"
  $ git config --global user.email "39722051@qq.com"

4: ��ȡ��˽��
   $ ssh-keygen -t rsa -C "youremail@example.com"
   �ҵģ�
   ssh-keygen -t rsa -b 4096 -C "39722051@qq.com"
   Ĭ�Ϲ�˽��������c/user/administrator/.ssh/...

5: ��github������½����setting�� sshkey�˵���ӹ��ס�
   
6: ��������������Բ��������Ƿ���ͨ��
   $ ssh -T git@github.com

The authenticity of host 'github.com (52.74.223.119)' can't be established.
RSA key fingerprint is SHA256:nThbg6kXUpJWGl7E1IGOCspRomTxdCARLviKw6E5SY8.
Are you sure you want to continue connecting (yes/no)? yes
Warning: Permanently added 'github.com,52.74.223.119' (RSA) to the list of known hosts.

Hi wxg-git! You've successfully authenticated, but GitHub does not provide shell access.

   ������ʾ������ yes

7:���һ���ļ�����
  git add �ļ�����  �� git add .  (.��ʾ�����ļ�)

  git add .

7.1������ͨ��git status �鿴״̬
   
8:�ύ�ļ������زֿ�
  git commit   ��  git commit -m '�ύ��ע��Ϣ'

9���ص㣺�����Զ�ֿ̲�Ĺ���
  git remote add Զ�ֿ̲��� git@github.com:�û���/�ֿ���.git
  git remote -v  //�鿴������Ϣ
  git remote rm  Զ�̿������   //�������

  �ҵģ�
  git remote add origin git@github.com:wxg-git/SPBoot201912.git 

10:�����زֿ� ���͵�����ֿ�
   git push -u Զ�̿����� master
   �ҵ�
   git push -u origin master

11:��¡����ֿ�
   git clone git@github.com:�û���/�ֿ���.git 
   
   git clone git@github.com:wxg-git/SPBoot201912.git 


