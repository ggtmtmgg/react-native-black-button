
# react-native-black-button

## Getting started

`$ npm install react-native-black-button --save`

### Mostly automatic installation

`$ react-native link react-native-black-button`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-black-button` and add `RNBlackButton.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNBlackButton.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNBlackButtonPackage;` to the imports at the top of the file
  - Add `new RNBlackButtonPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-black-button'
  	project(':react-native-black-button').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-black-button/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-black-button')
  	```

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNBlackButton.sln` in `node_modules/react-native-black-button/windows/RNBlackButton.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using Black.Button.RNBlackButton;` to the usings at the top of the file
  - Add `new RNBlackButtonPackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import RNBlackButton from 'react-native-black-button';

// TODO: What to do with the module?
RNBlackButton;
```
  