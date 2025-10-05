# Git-fundamentos

## Codigos principales de Git.

- Git init

- Git status

- Git add .

- Git commit -m "..."

- Git branch -M main

- Git remoto add origin "Link"

- Git push -u origin main

##En caso de error.
#### El remoto tiene commits (README, etc.)
 
 Git pull --rebase origin main 
 Git push -u origin main
 
 #### Se borro o corrompio todo y tienes que volver al ultimo commit
 
 git checkout -- .
