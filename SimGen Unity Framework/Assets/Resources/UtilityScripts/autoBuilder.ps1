$tempFile = $args[4].replace("autoBuildLog.txt","tempautoBuildLog.txt")
Write-Host "-------------------------------------------------------------------------------------------------------------------" >> $args[4]
if($args[0] -eq "true"){
  if([Environment]::Is64BitOperatingSystem){
    C:\Program Files\Unity\Editor\Unity.exe -batchmode -nographics -quit projectPath=$args[1] $args[2] $args[3] -logFile $tempFile
  }else{
  C:\Program Files (x86)\Unity\Editor\Unity.exe -batchmode -nographics -quit projectPath=$args[1] $args[2] $args[3] -logFile $tempFile
  }
}
if($args[0] -eq "false"){
  if([Environment]::Is64BitOperatingSystem){
    C:\Program Files\Unity\Editor\Unity.exe -batchmode -quit projectPath=$args[1] $args[2] $args[3] -logFile $tempFile
  }else{
    C:\Program Files (x86)\Unity\Editor\Unity.exe -batchmode -quit projectPath=$args[1] $args[2] $args[3] -logFile $tempFile
  }
}
Get-Content $tempFile >> $args[4]
