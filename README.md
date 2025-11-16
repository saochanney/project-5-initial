# Project 5: Sorting Things Out

## Overview

This project focuses on implementing and analyzing three lesser-known but fascinating sorting algorithms using AI-assisted development. You'll work with Gnome Sort, Cocktail Shaker Sort, and Shell Sort, utilizing AI tools to generate implementations from pseudocode and develop comprehensive unit tests. This project emphasizes understanding algorithmic complexity, verifying AI-generated code against detailed specifications, and building robust test suites for algorithms you may not have encountered before.

## Learning Objectives

By completing this project, you will:

- Translate pseudocode specifications into working implementations using AI assistance
- Analyze and verify AI-generated sorting algorithm implementations for **Comparable objects**
- Develop comprehensive unit tests for algorithm correctness and edge cases
- Compare algorithmic complexity through empirical testing
- Practice critical evaluation of AI-generated code against specifications (especially variable naming)
- Build understanding of how different sorting approaches handle various data patterns
- Work with generic types and Java's Comparable interface

## Project Structure

```
src/
├── main/java/com/example/sorting/
│   ├── SortingUtility.java       # Your sorting implementations (includes swap method)
│   └── SortingDriver.java        # Testing/demonstration driver (provided)
└── test/java/com/example/sorting/
    └── SortingUtilityTest.java   # Your unit tests
```

**Important Notes:**
- The `SortingUtility` class includes a `swap()` method you can use
- All methods work with **Comparable objects** (generic types)
- Template repository: https://github.com/UltimateSandbox/project-5-initial.git

## Technical Requirements

- **Java Version**: Java 21
- **Package Structure**: All classes must be in the `com.example.sorting` package
- **Testing Framework**: JUnit 5
- **Build Tool**: Maven (configured in template)
- **AI Tools**: ChatGPT, Claude, CoPilot, or other code-generation LLMs

## Project Phases

### Phase 1: Design & Pseudocode Analysis

**Objectives:**
- Review provided pseudocode for three sorting algorithms
- Understand the specifications and expected behavior
- Plan your AI interaction strategy for working with Comparable objects

**Deliverables:**
1. Review the pseudocode for:
   - **Part A: Gnome Sort** (50 points) - An iterative sort that works like a garden gnome sorting flower pots
   - **Part B: Cocktail Shaker Sort** (75 points) - A bidirectional bubble sort variant
   - **Part C: Shell Sort** (75 points) - An efficient gap-based insertion sort
2. Identify key variables, loop structures, and algorithm logic
3. Note that all algorithms must work with **Comparable objects** (generics)
4. Document your understanding of each algorithm's approach in `docs/REFLECTION.md`
5. Plan your AI prompting strategy, focusing on:
   - Preserving variable names from pseudocode
   - Ensuring generic Comparable implementation
   - Requesting comments for clarity
6. Document all AI interactions in `docs/AI_INTERACTIONS.md`

**Key Requirements:**
- **CRITICAL**: You must use the **exact variable names** from the pseudocode to receive full credit
- All sorts must handle arrays of Comparable objects (generic implementation)
- You may use the provided `swap()` method where appropriate

### Phase 2: AI-Assisted Implementation

**Objectives:**
- Generate sorting algorithm implementations using AI tools
- Verify that AI-generated code matches pseudocode specifications **exactly**
- Ensure proper variable naming and code structure
- Work with generic Comparable objects

**Implementation Guidelines:**

1. **Prompt Engineering Strategy:**
   - Provide the pseudocode to your AI tool
   - **Specify that variable names from pseudocode must be preserved EXACTLY**
   - Request implementation for Comparable objects (generic array)
   - Request clear comments explaining each step
   - Mention the available `swap()` method when applicable
   - Document all AI interactions in `docs/AI_INTERACTIONS.md`

2. **Method Requirements:**

```java
/**
 * Sorts an array using Gnome Sort algorithm (Part A - 50 points)
 * Works like a garden gnome sorting flower pots
 * @param a the array of Comparable objects to sort (modified in place)
 */
public static <T extends Comparable<T>> void gnomeSort(T[] a) {}

/**
 * Sorts an array using Cocktail Shaker Sort algorithm (Part B - 50 points)
 * A bidirectional bubble sort that alternates direction each pass
 * @param a the array of Comparable objects to sort (modified in place)
 */
public static <T extends Comparable<T>> void cocktailShakerSort(T[] a) {}

/**
 * Sorts an array using Shell Sort algorithm (NOT REQUIRED - removed from grading)
 * Uses Ciura gap sequence for improved performance
 * @param a the array of Comparable objects to sort (modified in place)
 */
public static <T extends Comparable<T>> void shellSort(T[] a) {}
```

3. **Pseudocode Reference:**

**Part A: Gnome Sort Pseudocode**
```
procedure gnomeSort(a[]):
    pos := 0
    while pos < length(a):
        if (pos == 0 or a[pos] >= a[pos-1]):
            pos := pos + 1
        else:
            swap a[pos] and a[pos-1]
            pos := pos - 1
```

**Part B: Cocktail Shaker Sort Pseudocode**
```
procedure cocktailShakerSort(a : list of sortable items) is
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
```

**Part C: Shell Sort Pseudocode**
```
# Sort an array a[0...n-1].
gaps = [701, 301, 132, 57, 23, 10, 4, 1]  # Ciura gap sequence
n = a[] length

# Start with the largest gap and work down to a gap of 1
foreach (gap in gaps)
{
    # Do a gapped insertion sort for every elements in gaps
    for (i = gap; i < n; i += 1)
    {
        # save a[i] in temp and make a hole at position i
        temp = a[i]
        # shift earlier gap-sorted elements up until the correct location for a[i] is found
        for (j = i; (j >= gap) && (a[j - gap] > temp); j -= gap)
        {
            a[j] = a[j - gap]
        }
        # put temp (the original a[i]) in its correct location
        a[j] = temp
    }
}
```

**Helpful Hints:**
- **Gnome Sort**: Watch variable name - it's `a` not `arr`
- **Cocktail Shaker Sort**: Watch variable name - it's `a` or `arr`
- **Shell Sort**: Create `gaps` as an ArrayList, work with Comparable objects
- Use the provided `swap()` method where appropriate
- Wikipedia links provided in original assignment for additional context

4. **Verification Requirements:**
   - Compare AI implementation line-by-line with pseudocode
   - **Verify variable names match pseudocode EXACTLY** (this is required for full credit)
   - Check that algorithm logic follows pseudocode structure
   - Verify generic implementation works with Comparable objects
   - Test with simple examples manually before moving to unit tests

**AI Interaction Log Requirements:**

For each sorting algorithm (Gnome Sort and Cocktail Shaker Sort), document:
- Initial prompt provided to AI (include the pseudocode you gave it)
- AI-generated code response
- Any follow-up prompts for corrections or clarifications
- **Verification notes**: How you confirmed variable names match pseudocode exactly
- Any modifications you made and why (especially around Comparable objects and generics)
- Notes on how AI handled the swap method integration

### Phase 3: AI-Assisted Test Development

**Objectives:**
- Generate comprehensive unit tests using AI assistance
- Verify test coverage for edge cases and typical cases
- Ensure tests validate algorithm correctness with Comparable objects

**Testing Requirements:**

1. **Test Categories**:
   - Empty array: `[]`
   - Single element: `[5]`
   - Already sorted: `[1, 2, 3, 4, 5]`
   - Reverse sorted: `[5, 4, 3, 2, 1]`
   - Duplicates: `[3, 1, 4, 1, 5, 9, 2, 6, 5, 3]`
   - All same elements: `[5, 5, 5, 5, 5]`
   - Two elements (swapped): `[2, 1]`
   - Two elements (sorted): `[1, 2]`
   - Random order: `[64, 34, 25, 12, 22, 11, 90]`
   - **String arrays**: Test with Comparable objects other than integers (e.g., `["zebra", "apple", "mango", "banana"]`)

2. **Test Generation Strategy:**
   - Use AI to generate initial test suite for generic Comparable types
   - Ask AI to handle both Integer and String test cases
   - Ask AI to identify additional edge cases specific to these algorithms
   - Verify that tests check proper sorting behavior

3. **Algorithm-Specific Considerations:**
   - **Gnome Sort**: Test that `pos` variable handles edge cases correctly (0 position, backtracking)
   - **Cocktail Shaker Sort**: Test bidirectional behavior (does it properly sweep both directions?)
   - Verify tests work with generic Comparable types, not just integers

4. **Test Verification:**
   - Run all tests and ensure they pass
   - Verify tests actually validate correct sorting
   - Check that tests work with different Comparable types
   - Add any missing test cases AI didn't generate
   - Document test coverage

**AI Interaction Log Requirements:**

Document:
- Prompts used to generate test suite in `docs/AI_INTERACTIONS.md`
- Any modifications to improve test coverage
- Analysis of test quality and completeness in `docs/REFLECTION.md`

### Phase 4: Performance Analysis & Validation

**Objectives:**
- Use provided `SortingDriver` to compare algorithm performance
- Analyze algorithmic complexity empirically
- Validate that implementations perform as expected

**Analysis Tasks:**

1. **Performance Testing:**
   - Run `SortingDriver` with various input sizes (small, medium, large)
   - Record timing results for each algorithm in `docs/PERFORMANCE_ANALYSIS.md`
   - Compare performance across different input patterns (sorted, random, reverse)

2. **Complexity Analysis:**
   - Compare empirical results with theoretical complexity
   - **Gnome Sort**: Expected O(n²) worst case, but how does it compare to Cocktail Shaker?
   - **Cocktail Shaker Sort**: Also O(n²) but often faster than bubble sort - why?
   - Identify which algorithm performs best in different scenarios
   - Document observations about performance characteristics in `docs/PERFORMANCE_ANALYSIS.md`

3. **Validation Questions:**
   - Does Gnome Sort show consistent O(n²) behavior?
   - How does Cocktail Shaker Sort perform on nearly-sorted data vs. reverse-sorted?
   - Does bidirectional sweeping in Cocktail Shaker provide observable benefits?
   - How do these algorithms compare to standard bubble sort?
   - Are there any unexpected performance patterns?

**Deliverables:**
- All AI interaction logs in `docs/AI_INTERACTIONS.md`
- All reflections in `docs/REFLECTION.md`
- All timing results and analysis in `docs/PERFORMANCE_ANALYSIS.md`
- Analysis of results vs. theoretical expectations in `docs/PERFORMANCE_ANALYSIS.md`
- Reflection on AI-assisted development effectiveness for unfamiliar algorithms in `docs/REFLECTION.md`

## AI-Assisted Development Analysis

After completing the implementation and testing phases, reflect on these questions:

### Code Generation Effectiveness

1. **Accuracy Assessment:**
   - Did the AI correctly implement the pseudocode on first attempt?
   - Did AI preserve the **exact variable names** from pseudocode? (Critical requirement!)
   - How well did AI handle the generic Comparable implementation?
   - What corrections or clarifications were needed?

2. **Working with Unfamiliar Algorithms:**
   - Had you heard of Gnome Sort or Cocktail Shaker Sort before this project?
   - How did using AI help (or hinder) learning these new algorithms?
   - Did relying on AI affect your understanding of how these algorithms work?
   - Could you explain the algorithm logic without referring to the code?

3. **Code Quality:**
   - Was the AI-generated code readable and well-structured?
   - Did it include appropriate comments?
   - How did AI handle the generic type constraints for Comparable?
   - Were there any efficiency issues or unnecessary complexity?

4. **Prompt Engineering:**
   - What prompt strategies worked best for algorithm generation?
   - How did you ensure AI would use exact variable names?
   - How specific did you need to be about generic types and Comparable?
   - What would you do differently next time?

### Test Generation Effectiveness

1. **Coverage Analysis:**
   - Did AI identify all important edge cases?
   - Did AI suggest testing with different Comparable types (Integer, String)?
   - Were there gaps in test coverage you had to fill?
   - How comprehensive were AI-generated test assertions?

2. **Test Quality:**
   - Were the tests actually validating correct behavior?
   - Did AI generate any unnecessary or redundant tests?
   - How did AI-generated tests compare to tests you would write manually?
   - Did tests properly verify generic type behavior?

3. **Efficiency Gains:**
   - How much time did AI assistance save in test development?
   - What aspects of testing still required manual effort?
   - When was AI most/least helpful in the testing process?
   - Did AI help you think of test cases you wouldn't have considered?

## Grading Rubric (200 points)

### Implementation (100 points)

**Gnome Sort - Part A (30 points)**
- ✓ Correct implementation matching pseudocode (15 pts)
- ✓ **Exact variable names from pseudocode** (`pos`, `a`) (6 pts)
- ✓ Proper generic implementation with Comparable (5 pts)
- ✓ Code clarity and comments (4 pts)

**Cocktail Shaker Sort - Part B (30 points)**
- ✓ Correct implementation matching pseudocode (15 pts)
- ✓ **Exact variable names from pseudocode** (`swapped`, `a`, `i`) (6 pts)
- ✓ Proper generic implementation with Comparable (5 pts)
- ✓ Code clarity and comments (4 pts)

**Shell Sort - (Part C) (40 points)**
- ✓ Correct implementation matching pseudocode (20 pts)
- ✓ **Exact variable names from pseudocode** (`gaps`, `n`, `i`, `j`, `temp`) (10 pts)
- ✓ Proper generic implementation with Comparable (6 pts)
- ✓ Code clarity and comments (4 pts)

### Unit Testing (60 points)

**Test Coverage (30 points)**
- ✓ All required test categories for both algorithms (18 pts)
- ✓ Tests with multiple Comparable types (Integer, String) (6 pts)
- ✓ Test organization and descriptive naming (6 pts)

**Test Quality (30 points)**
- ✓ Tests properly validate sorting behavior (18 pts)
- ✓ Appropriate assertions and error messages (6 pts)
- ✓ All tests pass (6 pts)

### AI Interaction Documentation (30 points)

**Implementation Logs (8 points)**
- ✓ Complete prompts for both algorithms with pseudocode (3 pts)
- ✓ AI responses documented (2 pts)
- ✓ Verification notes on variable naming and modifications (3 pts)

**Testing Logs (7 points)**
- ✓ Test generation prompts documented (2 pts)
- ✓ Coverage analysis documented (3 pts)
- ✓ Test modifications explained (2 pts)

### Performance Analysis & Reflection (10 points)

**Performance Analysis (4 points)**
- ✓ Empirical results documented (2 pt)
- ✓ Complexity comparison between algorithms (2 pt)

**AI Development Reflection (6 points)**
- ✓ Code generation effectiveness analyzed (2 pt)
- ✓ Test generation effectiveness analyzed (2 pt)
- ✓ Thoughtful insights on learning unfamiliar algorithms with AI (2 pt)

## Submission Requirements

Submit via GitHub repository (forked from https://github.com/UltimateSandbox/project-5-initial.git) containing:

1. **Source Code:**
   - `SortingUtility.java` with Gnome Sort and Cocktail Shaker Sort implementations
   - `SortingUtilityTest.java` with comprehensive test suite
   - `SortingDriver.java` (provided, can be modified for testing)

2. **Documentation:**
   - `AI_INTERACTIONS.md` - Complete log of all AI interactions for both algorithms
   - `PERFORMANCE_ANALYSIS.md` - Performance testing results and complexity analysis
   - `REFLECTION.md` - Answers to AI-assisted development analysis questions

3. **Canvas Submission:**
   - Submit your GitHub repository link in Canvas

## Getting Started

1. **Fork and clone the repository:**
   ```bash
   # Fork on GitHub first, then:
   git clone [your-forked-repository-url]
   ```
   or clone using IntelliJ directly:
   ```plaintext
    File -> New -> Project from Version Control -> Git
    Paste your-forked-repository-url
   ```

2. **Review the pseudocode:**
   - Gnome Sort pseudocode (Part A)
   - Cocktail Shaker Sort pseudocode (Part B)
   - Pay special attention to **variable names** - they must match exactly

3. **Examine the SortingUtility class:**
   - Note the provided `swap()` method you can use
   - Look at the method signatures (already set up for generics)
   - Check the TODOs tab in your IDE

4. **Set up your AI interaction logs:**
   - Note the provided `AI_INTERACTIONS.md` to track all prompts and responses
   - Use consistent formatting for easy review

5. **Begin implementation:**
   - Start with Gnome Sort (Part A - simpler algorithm)
   - Then implement Cocktail Shaker Sort (Part B - more complex)
   - Finally, implement Shell Sort (Part C - most complex)
   - Test each with the driver before moving to unit tests

## Tips for Success

**Effective AI Prompting:**
- Be **explicit** about preserving variable names from pseudocode
- Specify "generic method using Comparable objects" or "works with any Comparable type"
- Request step-by-step comments explaining the algorithm
- Mention the available `swap()` method and ask AI to use it where appropriate
- For Cocktail Shaker, emphasize the bidirectional sweeping behavior

**Implementation Verification:**
- Test with simple arrays manually before unit tests
- Trace through algorithm steps for small examples (e.g., [3, 1, 2])
- Compare implementation logic directly to pseudocode line-by-line
- **Double-check variable names** - `pos` vs `position`, `A` vs `a` matters!
- Watch for off-by-one errors in loop bounds

**Generic Types & Comparable:**
- Remember: `T extends Comparable<T>` for the generic type parameter
- Use `compareTo()` method for comparing Comparable objects
- Test with both Integer and String arrays to verify generics work
- AI might need reminding about Comparable interface requirements

**Algorithm-Specific Notes:**
- **Gnome Sort**: The `pos` variable backtracks - make sure this is working correctly
- **Cocktail Shaker**: Watch the forward and backward sweep logic - easy to get loop bounds wrong
- **Shell Sort** (if attempting): ArrayList for gaps, careful with the triple nested structure

**Testing Strategy:**
- Generate comprehensive tests before assuming code is correct
- Include both typical and edge cases
- Test with different Comparable types (Integer, String, custom objects)
- Use descriptive test names that explain what's being tested
- Verify that failing tests actually catch errors

**Common Pitfalls:**
- Don't assume AI-generated code is correct without verification
- Variable naming mistakes will cost you points - check carefully!
- Generic implementations require proper type constraints
- Empty arrays and single-element arrays are easy to overlook
- Make sure all sorts handle duplicate values correctly
- Cocktail Shaker's bidirectional logic is easy to mess up

## Academic Integrity

This project **encourages** using AI tools for code generation, but requires:
- Full documentation of all AI interactions
- Personal verification and understanding of generated code
- Original analysis and reflection on AI assistance
- No sharing of prompts or code with other students

You must be able to explain any code you submit, whether AI-generated or not.

## Resources

- **Project Template**: https://github.com/UltimateSandbox/project-5-initial.git
- **Gnome Sort**: https://en.wikipedia.org/wiki/Gnome_sort
- **Cocktail Shaker Sort**: https://en.wikipedia.org/wiki/Cocktail_shaker_sort
- **Shell Sort** (optional): https://en.wikipedia.org/wiki/Shellsort
- **Java Comparable Interface**: https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Comparable.html
- **JUnit 5 Documentation**: https://junit.org/junit5/docs/current/user-guide/
- **Course prompting guide**: `docs/AI_PROMPTING_GUIDE.md`

## Questions?

Post in Discord or set up time in my normal office hours. Include specific details about:
- Which algorithm you're working on
- What AI tool you're using
- What specific behavior you're seeing vs. expecting
- Relevant code snippets and test results
