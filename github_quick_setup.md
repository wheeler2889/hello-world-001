Get started by creating a new file or uploading an existing file. We recommend every repository include a `README`, `LICENSE`, and `.gitignore`.

…or create a new repository on the command line
```
echo "# myrepo" >> README.md
git init
git add README.md
git commit -m "first commit"
git remote add origin https://github.com/wheeler2889/hello-world-001.git
git push -u origin main
``` 

…or push an existing repository from the command line
```
git remote add origin https://github.com/wheeler2889/hello-world-001.git
git pull origin master --allow-unrelated-histories
git commit -a -m "merge"
git push -u origin main
```

C:\workspace\Git\hello-world-001>git push -u origin main
Username for 'https://github.com': wheeler2889
Password for 'https://wheeler2889@github.com':
remote: Support for password authentication was removed on August 13, 2021.
remote: Please see https://docs.github.com/en/get-started/getting-started-with-git/about-remote-repositories#cloning-with-https-urls for information on currently recommended modes of authentication.
fatal: Authentication failed for 'https://github.com/wheeler2889/hello-world-001.git/'

…or import code from another repository

You can initialize this repository with code from a Subversion, Mercurial, or TFS project.
