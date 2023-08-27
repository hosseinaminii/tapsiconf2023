import SwiftUI
import shared

struct ContentView: View {
    
    @StateObject
    var iosGithubViewModel = IOSGithubViewModel()

	var body: some View {
         List {
             ForEach(iosGithubViewModel.items, id: \.self) { item in
                 Item(itemResponse: item)
             }
         }.onDisappear {
             iosGithubViewModel.clear()
         }
	}
}

struct Item: View {
    var itemResponse: ItemResponse
    
    var body: some View {
        VStack(alignment: .leading) {
            Text(String(itemResponse.name))
            Text("forks: " + String(itemResponse.forks) + " whatchers: " + String(itemResponse.watchers) + " open issues: " + String(itemResponse.openIssues))
        }.padding()
    }
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
		ContentView()
	}
}
