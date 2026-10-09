Set-Location "D:\CORE JAVA"

while ($true) {
    git add .
    $changes = git status --porcelain

    if ($changes) {
        git commit -m "Update Java class practice"

        if ($LASTEXITCODE -eq 0) {
            git push origin main
        }
    }

    Start-Sleep -Seconds 300
}