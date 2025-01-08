.model small
.stack
.data
    use db "Username: $"
    paa db "Password: $"
    correct db "Login Successful!$"
    wrong db "Login Failed!$"
    exitstr db "Press x to try again or press anything to exit$"
.code
 
cbmv:
    mov ax, @data
    mov ds, ax

    mov ax, 0600h                   ; Clear screen
    mov bh, 07h
    mov cx, 0000h
    mov dx, 184fh
    int 10h
    
    mov ah, 02h                     ; Cursor location 
    mov bh, 00h
    mov dh, 0
    mov dl, 0
    int 10h
 
    mov ah, 09h                     ; Display username prompt
    mov dx, offset use
    int 21h
    
    mov ah, 02h
    mov dh, 0
    mov dl, 10
    int 10h
    
    mov dl, 0                       ; Initialize dl for counting username correct chars
    
    u1:                             ; Input username [correct is cbmv]
        mov ah, 01h
        int 21h
        cmp al, 'c'
        je cor1
        jne u2
    cor1:
        inc dl
        jmp u2
        
    u2:
        mov ah, 01h
        int 21h
        cmp al, 'b'
        je cor2
        jne u3
    cor2:
        inc dl
        jmp u3
        
    u3:
        mov ah, 01h
        int 21h
        cmp al, 'm'
        je cor3
        jne u4
    cor3:
        inc dl
        jmp u4
        
    u4:
        mov ah, 01h
        int 21h
        cmp al, 'v'
        je cor4
        jne passer
        
    cor4:
        inc dl
        mov bl, dl
        jmp passer
        
    passer:
        mov ah, 02h                 ; Cursor location for password input
        mov bh, 00h
        mov dh, 1
        mov dl, 0
        int 10h
        
        mov ah, 09h                 ; Display password prompt
        mov dx, offset paa
        int 21h
        
        mov ah, 02h                 ; Cursor location for password input
        mov bh, 00h
        mov dh, 1
        mov dl, 10
        int 10h
        
        mov bh, 0                   ; Initialize bh for counting password correct chars
        
    r1:                             ; Input password [correct is 2b2t]
        mov ah, 07h
        int 21h
        cmp al, '2'
        mov ah, 02h
        mov dl, '*'
        int 21h
        je dor1
        jne r2
    dor1:
        inc bh
        jmp r2
        
    r2:
        mov ah, 07h
        int 21h
        cmp al, 'b'
        mov ah, 02h
        mov dl, '*'
        int 21h
        je dor2
        jne r3
    dor2:
        inc bh
        jmp r3
        
    r3:
        mov ah, 07h
        int 21h
        cmp al, '2'
        mov ah, 02h
        mov dl, '*'
        int 21h
        je dor3
        jne r4
    dor3:
        inc bh
        jmp r4
        
    r4:
        mov ah, 07h
        int 21h
        cmp al, 't'
        mov ah, 02h
        mov dl, '*'
        int 21h
        je dor4
        jne compareusername
    dor4:
        inc bh
        jmp compareusername
        
    cbmvcheck:                      ; Checkpoint for returning back to start
        jmp cbmv
        
    compareusername:                ; Compare entered username
        cmp bl, 4
        je correctusrp
        jne wronginput
        
    correctusrp:                    ; Compare entered password
        mov bl, bh
        cmp bl, 4
        je correctboth
        jne wronginput
        
    wronginput:                     ; Display Login Failed message
        mov ah, 02h
        mov bh, 00h
        mov dh, 5
        mov dl, 0
        int 10h
        
        mov ah, 09h
        mov dx, offset wrong
        int 21h
        
        mov ah, 02h
        mov bh, 00h
        mov dh, 6
        mov dl, 0
        int 10h
           
        mov ah, 09h
        mov dx, offset exitstr      ; Prompt to try again or exit
        int 21h
        
        mov ah, 07h                 ; Read user input
        int 21h
        
        cmp al, 'x'                 ; Check if user wants to try again
        je cbmvcheck
        
        jmp exit                    ; Else exit program
        
    correctboth:                    ; Display Login Successful message
        mov ah, 02h
        mov bh, 00h
        mov dh, 5
        mov dl, 0
        int 10h
        
        mov ah, 09h
        mov dx, offset correct
        int 21h
        
    exit:                           ; Exit program
        mov ah, 4ch
        int 21h
        end cbmv
