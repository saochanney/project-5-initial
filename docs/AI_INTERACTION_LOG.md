Using claude - these are the prompts:
* for gnome sort:
I need a method body in Java that has the header public static <T extends Comparable<T>> void gnomeSort(T[] a) . The method will sort an array using Gnome Sort algorithm that works like a garden gnome sorting flower pots. It should identify key variables, loop structures, and algorithm logic and has to work with Comparable objects, and include comments for clarity. The variable names should be the exact ones from the pseudocode, and can use the swap() method if appropriate. This is the pseudocode: procedure gnomeSort(a[]):
pos := 0
while pos < length(a):
if (pos == 0 or a[pos] >= a[pos-1]):
pos := pos + 1
else:
swap a[pos] and a[pos-1]
pos := pos - 1
  * Here I made sure that I used the psudocode that was provided in the README to make sure that the AI would generate using all the correct variables (as best that the engine can). The AI also generated the swap method which I did not include when I pasted the result as the method is already included.
* for cocktail shaker sort:
  I need a method body that has the header public static <T extends Comparable<T>> void cocktailShakerSort(T[] a). This method should sort an array using Cocktail Shaker Sort algorithm in a bidirectional bubble sort that alternates direction each pass. It should identify key variables, loop structures and algorithm logic, and must work with Comparable objects. Add comments for clarity and provide an option for the swap method if it is needed (don't include if not necessary). The variables must match the ones from the pseudocode: procedure cocktailShakerSort(a : list of sortable items) is
  do
  swapped := false
  for each i in 0 to length(a) − 1 do:
  if a[i] > a[i + 1] then
  swap(a[i], a[i + 1])
  swapped := true
  end if
  end for
  if not swapped then
  break do-while loop
  end if
  swapped := false
  for each i in length(a) − 1 to 0 do:
  if a[i] > a[i + 1] then
  swap(a[i], a[i + 1])
  swapped := true
  end if
  end for
  while swapped
  end procedure
  * I also pasted the pseudocode to make sure all the variables are what they are supposed to be. Afterwards, I was still a little confused on the swapped variable so I asked AI to explain that to me. Basically it was to let the program know what to do when the number needs to be swapped with another to be put into the correct order (duh, I was just having a moment). All the variables are correct (to my understanding) and the AI also provided the swapped method in this response that I decided to leave out because there is already one provided.
* for shell sort:
  I need a method body that has the header public static <T extends Comparable<T>> void shellSort(T[] a). This will create gaps as an ArrayList and work with Comparable objects and use the swap90 method if it is needed. This method must be written based on the pseudocode: # Sort an array a[0...n-1].
  gaps = [701, 301, 132, 57, 23, 10, 4, 1]  # Ciura gap sequence
  n = a[] length
 Start with the largest gap and work down to a gap of 1
foreach (gap in gaps)
{
 Do a gapped insertion sort for every elements in gaps
for (i = gap; i < n; i += 1)
{
 save a[i] in temp and make a hole at position i
temp = a[i]
 shift earlier gap-sorted elements up until the correct location for a[i] is found
for (j = i; (j >= gap) && (a[j - gap] > temp); j -= gap)
{
a[j] = a[j - gap]
}
#put temp (the original a[i]) in its correct location
a[j] = temp
}
}
  * I explained what I needed from the method but a lot of the # from the psuedocode made the spacing on this document weird, so I had to take them out for my brain. I made sure that the variables are taken straight from the psuedocode
  * The code does not automatically import the collections, so after I pasted in the code into the program, I made sure to import those Array and ArrayList collections to make the program useable.
* for testing class:
  i need to create a test class named SortingUtilityTest.java that has test categories empty array: [], single element array: [5], a sorted array: [1, 2, 3, 4, 5], a reverse sorted array: [5, 4, 3, 2, 1], a duplicates array: [3, 1, 4, 1, 5, 9, 2, 6, 5, 3], an array with all the same elements: [5, 5, 5, 5, 5], an array with two elements swapped: [2, 1], an array with two elements sorted: [1, 2], a random order array:; [64, 34, 25, 12, 22, 11, 90], and a String array that tests comparable objects other than integers: ["zebra", "apple", "mango", "banana"]. The class must use JUnit 5, tests generic Comparable types, covers all required categories, includes algorithm-specific tests, and provides additional AI-identified edge cases to the specific algorithms, and the tests check proper sorting behavior. Some algorithm=specific considerations that should be taken into account, the gnome sort test that pos variable handles edge cases correctly, the cocktail shaker sort test bidirectional behavior, and verify the tests work with generic comparable types and not just integers. 
  * The test class went smoothly, I was more in a rush with that one so I made sure there were no errors, and that all the tests were included, and the AI did not forget anything (hopefully I didn't forget anything, lol). One of the things that I was grateful for, is that when making this class, since I made the class altogether and not section by section like I did with the rest of the project, they were able to import the collections that were needed for me. However, one of thet things that the AI made a mistake on, it with one of the testing classes, they used a name that another class had, so I just added on to the name a little bit and BOOM, error was fixed. 


Below I asked AI for first but it's a lot so I put it at the bottom of the log

I asked ChatGPT to explain to me what each of the
phases are asking of me:
    - explain to be what this project is 
   asking on me: Phase 1: Design & Pseudocode 
   Analysis Objectives: Review provided pseudocode
   for three sorting algorithms Understand the 
   specifications and expected behavior Plan your AI interaction strategy for working with Comparable objects Deliverables: Review the pseudocode for: Part A: Gnome Sort (50 points) - An iterative sort that works like a garden gnome sorting flower pots Part B: Cocktail Shaker Sort (75 points) - A bidirectional bubble sort variant Part C: Shell Sort (75 points) - An efficient gap-based insertion sort Identify key variables, loop structures, and algorithm logic Note that all algorithms must work with Comparable objects (generics) Document your understanding of each algorithm's approach in docs/REFLECTION.md Plan your AI prompting strategy, focusing on: Preserving variable names from pseudocode Ensuring generic Comparable implementation Requesting comments for clarity Document all AI interactions in docs/AI_INTERACTIONS.md
      - can you add Key Requirements: CRITICAL: You must use the exact variable names from the pseudocode to receive full credit
All sorts must handle arrays of Comparable objects (generic implementation)
You may use the provided swap() method where appropriate
    - can you explain phase 2 of the project? Phase 2: AI-Assisted Implementation Objectives: Generate sorting algorithm implementations using AI tools Verify that AI-generated code matches pseudocode specifications exactly Ensure proper variable naming and code structure Work with generic Comparable objects Implementation Guidelines: Prompt Engineering Strategy: Provide the pseudocode to your AI tool Specify that variable names from pseudocode must be preserved EXACTLY Request implementation for Comparable objects (generic array) Request clear comments explaining each step Mention the available swap() method when applicable Document all AI interactions in docs/AI_INTERACTIONS.md Method Requirements: /** * Sorts an array using Gnome Sort algorithm (Part A - 50 points) * Works like a garden gnome sorting flower pots * @param a the array of Comparable objects to sort (modified in place) */ public static <T extends Comparable<T>> void gnomeSort(T[] a) {} /** * Sorts an array using Cocktail Shaker Sort algorithm (Part B - 50 points) * A bidirectional bubble sort that alternates direction each pass * @param a the array of Comparable objects to sort (modified in place) */ public static <T extends Comparable<T>> void cocktailShakerSort(T[] a) {} /** * Sorts an array using Shell Sort algorithm (NOT REQUIRED - removed from grading) * Uses Ciura gap sequence for improved performance * @param a the array of Comparable objects to sort (modified in place) */ public static <T extends Comparable<T>> void shellSort(T[] a) {} Pseudocode Reference: Part A: Gnome Sort Pseudocode procedure gnomeSort(a[]): pos := 0 while pos < length(a): if (pos == 0 or a[pos] >= a[pos-1]): pos := pos + 1 else: swap a[pos] and a[pos-1] pos := pos - 1 Part B: Cocktail Shaker Sort Pseudocode procedure cocktailShakerSort(a : list of sortable items) is do swapped := false for each i in 0 to length(a) − 1 do: if a[i] > a[i + 1] then swap(a[i], a[i + 1]) swapped := true end if end for if not swapped then break do-while loop end if swapped := false for each i in length(a) − 1 to 0 do: if a[i] > a[i + 1] then swap(a[i], a[i + 1]) swapped := true end if end for while swapped end procedure Part C: Shell Sort Pseudocode # Sort an array a[0...n-1]. gaps = [701, 301, 132, 57, 23, 10, 4, 1] # Ciura gap sequence n = a[] length # Start with the largest gap and work down to a gap of 1 foreach (gap in gaps) { # Do a gapped insertion sort for every elements in gaps for (i = gap; i < n; i += 1) { # save a[i] in temp and make a hole at position i temp = a[i] # shift earlier gap-sorted elements up until the correct location for a[i] is found for (j = i; (j >= gap) && (a[j - gap] > temp); j -= gap) { a[j] = a[j - gap] } # put temp (the original a[i]) in its correct location a[j] = temp } } Helpful Hints: Gnome Sort: Watch variable name - it's a not arr Cocktail Shaker Sort: Watch variable name - it's a or arr Shell Sort: Create gaps as an ArrayList, work with Comparable objects Use the provided swap() method where appropriate Wikipedia links provided in original assignment for additional context Verification Requirements: Compare AI implementation line-by-line with pseudocode Verify variable names match pseudocode EXACTLY (this is required for full credit) Check that algorithm logic follows pseudocode structure Verify generic implementation works with Comparable objects Test with simple examples manually before moving to unit tests AI Interaction Log Requirements: For each sorting algorithm (Gnome Sort and Cocktail Shaker Sort), document: Initial prompt provided to AI (include the pseudocode you gave it) AI-generated code response Any follow-up prompts for corrections or clarifications Verification notes: How you confirmed variable names match pseudocode exactly Any modifications you made and why (especially around Comparable objects and generics) Notes on how AI handled the swap method integration
    - can you explain this project: Phase 3: AI-Assisted Test Development Objectives: Generate comprehensive unit tests using AI assistance Verify test coverage for edge cases and typical cases Ensure tests validate algorithm correctness with Comparable objects Testing Requirements: Test Categories: Empty array: [] Single element: [5] Already sorted: [1, 2, 3, 4, 5] Reverse sorted: [5, 4, 3, 2, 1] Duplicates: [3, 1, 4, 1, 5, 9, 2, 6, 5, 3] All same elements: [5, 5, 5, 5, 5] Two elements (swapped): [2, 1] Two elements (sorted): [1, 2] Random order: [64, 34, 25, 12, 22, 11, 90] String arrays: Test with Comparable objects other than integers (e.g., ["zebra", "apple", "mango", "banana"]) Test Generation Strategy: Use AI to generate initial test suite for generic Comparable types Ask AI to handle both Integer and String test cases Ask AI to identify additional edge cases specific to these algorithms Verify that tests check proper sorting behavior Algorithm-Specific Considerations: Gnome Sort: Test that pos variable handles edge cases correctly (0 position, backtracking) Cocktail Shaker Sort: Test bidirectional behavior (does it properly sweep both directions?) Verify tests work with generic Comparable types, not just integers Test Verification: Run all tests and ensure they pass Verify tests actually validate correct sorting Check that tests work with different Comparable types Add any missing test cases AI didn't generate Document test coverage AI Interaction Log Requirements: Document: Prompts used to generate test suite in docs/AI_INTERACTIONS.md Any modifications to improve test coverage Analysis of test quality and completeness in docs/REFLECTION.md


