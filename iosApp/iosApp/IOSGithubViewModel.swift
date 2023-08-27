//
//  IOSGithubViewModel.swift
//  iosApp
//
//  Created by Bama on 6/5/1402 AP.
//  Copyright © 1402 AP orgName. All rights reserved.
//

import Foundation
import shared
import KMPNativeCoroutinesAsync

@MainActor
class IOSGithubViewModel: ObservableObject {
    private let githubViewModel = GithubViewModel()
    
    @Published
    var items = Array<ItemResponse>()
    
    var task: Task<(), Never>? = nil
    
    init() {
        task = Task {
            do {
                let asyncItems = asyncSequence(for: githubViewModel.itemsFlow)
                for try await asyncItem in asyncItems {
                    items = asyncItem
                }
            } catch {
                print("Failed with error: \(error)")
            }
        }
    }
    
    func clear() {
        task?.cancel()
    }
}
