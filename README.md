# Git Command Cheat Sheet

## 1. Check Status

```bash
git status
```

---

## 2. Initialize Repository

```bash
git init
```

---

## 3. Add Files

Add all files:

```bash
git add .
```

Add one file:

```bash
git add Day01/Student.java
```

---

## 4. Commit Changes

```bash
git commit -m "Day 01 - Class and Entity"
```

---

## 5. View Commit History

Compact:

```bash
git log --oneline
```

Detailed:

```bash
git log
```

---

## 6. Add Remote Repository

```bash
git remote add origin https://github.com/eslavathnarasimhanaik/java60day.git
```

Check remote:

```bash
git remote -v
```

Remove remote:

```bash
git remote remove origin
```

---

## 7. Branch Commands

Check branch:

```bash
git branch
```

Rename branch:

```bash
git branch -M main
```

---

## 8. Push Code

First push:

```bash
git push -u origin main
```

Normal push:

```bash
git push origin main
```

Force push (Dangerous):

```bash
git push origin main --force
```

---

## 9. Pull Changes

```bash
git pull origin main
```

Allow unrelated histories:

```bash
git pull origin main --allow-unrelated-histories
```

---

## 10. Merge Problems

Finish merge:

```bash
git commit --no-edit
```

Abort merge:

```bash
git merge --abort
```

---

## 11. Undo Commits

Keep changes:

```bash
git reset --soft HEAD~1
```

Remove changes:

```bash
git reset --hard HEAD~1
```

Discard everything:

```bash
git reset --hard HEAD
```

---

## 12. Restore Files

One file:

```bash
git restore Day01/Student.java
```

---

## 13. Stash

Save work:

```bash
git stash
```

Restore work:

```bash
git stash pop
```

List stashes:

```bash
git stash list
```

---

## 14. Daily Workflow

```bash
git status
git add .
git commit -m "Day XX - Topic"
git push
```

Example:

```bash
git status
git add .
git commit -m "Day 01 - Class and Entity"
git push
```

---

## Repository Structure

```text
java60day/
├── Day01/
├── Day02/
├── ...
├── Day60/
├── git-cheatsheet.md
└── README.md
```
