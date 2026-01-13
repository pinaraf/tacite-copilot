# Application UI Layout

```
┌─────────────────────────────────────┐
│  Tacite Copilot            [_][□][X]│
├─────────────────────────────────────┤
│                                     │
│  ┌─────────────────────────────┐   │
│  │   Import CLIO data          │   │
│  └─────────────────────────────┘   │
│                                     │
│  ┌─────────────────────────────┐   │
│  │   Import HC data            │   │
│  └─────────────────────────────┘   │
│                                     │
│  ┌─────────────────────────────┐   │
│  │   Import Tacite data        │   │
│  └─────────────────────────────┘   │
│                                     │
│  ┌─────────────────────────────┐   │
│  │   Setup                     │   │
│  └─────────────────────────────┘   │
│                                     │
│  ┌─────────────────────────────┐   │
│  │   Quit                      │   │
│  └─────────────────────────────┘   │
│                                     │
└─────────────────────────────────────┘

Window Size: 400x300 pixels
Layout: 5 buttons in a vertical grid with 10px spacing
Padding: 20px margin around the button panel
```

## Button Descriptions

1. **Import CLIO data** - Placeholder for CLIO data import functionality
2. **Import HC data** - Placeholder for HC data import functionality  
3. **Import Tacite data** - Placeholder for Tacite data import functionality
4. **Setup** - Placeholder for setup/configuration functionality
5. **Quit** - Active button that exits the application when clicked

## Technical Details

- Framework: Java Swing
- Layout Manager: GridLayout(5, 1, 10, 10)
- Default Close Operation: EXIT_ON_CLOSE
- Window Position: Centered on screen
- Title: "Tacite Copilot"
