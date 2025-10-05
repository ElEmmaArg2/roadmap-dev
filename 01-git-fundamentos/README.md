# Git-fundamentos

## Codigos principales de Git.

- Git init

- Git status

- Git add .

- Git commit -m "..."

- Git branch -M main `*Esto solo si no pusimos el git config --global init.defaultBranch main*`

- Git remoto add origin "Link"

- Git push -u origin main

##En caso de error.
#### El remoto tiene commits (README, etc.)
 
 Git pull --rebase origin main 
 Git push -u origin main
 
 #### Se borro o corrompio todo y tienes que volver al ultimo commit
 
 git checkout -- .

 #### Una vez que ya hiciste un "git push -u origin main"

 git add .
 git commit -m "Actualizo..."
 git push

 #### En caso que se cree una nueva rama
 
 git checkout -b feature-login `*(crea y cambia a una rama nueva llamada feature-login)*`
 <sub>haces cambios...</sub> </n>
 git commit -m "Agrego login"
 git push -u origin feature-login
