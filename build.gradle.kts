import org.jetbrains.compose.desktop.application.dsl.TargetFormat

plugins {
   kotlin("jvm") version "1.9.22"
   id("org.jetbrains.compose") version "1.5.12"
   id("org.jetbrains.kotlin.plugin.serialization") version "1.9.22"

}

val voyagerVersion = "1.0.0"
group = "lol.ezra.dmxpro"

version = "1.0-SNAPSHOT"

repositories {
   mavenCentral()
   maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
   google()
}
dependencies {
   // Note, if you develop a library, you should use compose.desktop.common.
   // compose.desktop.currentOs should be used in launcher-sourceSet
   // (in a separate module for demo project and in testMain).
   // With compose.desktop.common you will also lose @Preview functionality
   implementation(compose.desktop.currentOs)
   // Multiplatform

   // Navigator
   implementation("cafe.adriel.voyager:voyager-navigator:$voyagerVersion")
   implementation("co.touchlab:kermit:2.0.4") //Add latest version
   implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.3")

   // Screen Model
   implementation("cafe.adriel.voyager:voyager-screenmodel:$voyagerVersion")
   implementation("cafe.adriel.voyager:voyager-tab-navigator:$voyagerVersion")
   implementation("io.github.theapache64:rebugger:1.0.0-rc03")

}

compose.desktop {
   application {
      mainClass = "MainKt"

      nativeDistributions {
         targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
         packageName = "DMXPro"
         packageVersion = "1.0.0"
      }
   }
}
