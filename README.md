# Java / JUnit starter project

This is a starter for projects in class that need JUnit 4 unit testing and hook into Travis CI for build testing. 

It started out life as a fork from [this repo](https://github.com/mplacona/java-junit-template-project), but has been tweaked a bit to match my needs. 

Replace this file with the instructions for the assignment and then push it to a new repo.

To clear out old commits for this repo so it's clean when it's pushed to GitHub use the following commands from the command line in the repo folder.

This one worked, but is supposed to have issues with submodules. 
```
rmdir .git -f
git init
git add .
git commit -m "Initial commit"
git remote add origin <github-uri>
git push -u --force origin master
```

This one is supposed to work with submodules, but I haven't tried it yet. 
```
git checkout --orphan newBranch
git add -A  # Add all files and commit them
git commit
git branch -D master  # Deletes the master branch
git branch -m master  # Rename the current branch to master
git push -f origin master  # Force push master branch to github
git gc --aggressive --prune=all     # remove the old files
```
