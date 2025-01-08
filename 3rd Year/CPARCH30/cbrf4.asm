.model small
.stack
.data
    strinput db "Welcome to Charles' StringGen", 13, 10 , "Choose your output:", 13, 10 , "1. Aa Bb Cc Dd Ee ... ... ... Yy Zz", 13, 10, "2. aZ bY cX dW eV ... ... ... yB zA", 13, 10, "3. ZA YB XC WD VE ... ... ... BY AZ", 13, 10, "4. User-based alphabetical sequence", 13, 10, "E: exit", 13, 10, "Input your choice: $"
    ltinput db "Input a letter: $"
    clearline db "                                                                                          $"
.code

cbrf:
mov ax, @data
mov ds, ax

mov ax, 0600h           ;clearscreen
mov bh, 07h 
mov cx, 0000h
mov dx, 184fh
int 10h

mov bh, 70h             ;setvidmode
mov cx, 0000h
mov dh, 100
mov dl, 100
int 10h

mov ah, 02h             ;cursorloc
mov bh, 00h
mov dh, 0
mov dl, 0
int 10h

mov ah, 09h
mov dx, offset strinput
int 21h

menuloop:

mov ah, 02h             ;cursorloc for the text input
mov bh, 00h
mov dh, 7
mov dl, 19
int 10h

mov ah, 01h
int 21h

cmp al, '1'
je con1
cmp al, '2'
je con2
cmp al, '3'
je con3
cmp al, '4'
je con4t
cmp al, 'E'
je exit1

con1:
    mov ah, 02h
    mov bh, 00h
    mov dh, 9
    mov dl, 0
    int 10h
    
    mov cx, 26
    mov dl, 'A'
    mov bh, 'a'
    mov bl, ' '

y1:
    int 21h
    mov dh, dl
    inc dh
    mov dl, bh
    int 21h
    inc bh
    mov dl, bl
    int 21h
    mov dl, dh
    loop y1
    jmp menuloop
    
con2:
    mov ah, 02h
    mov bh, 00h
    mov dh, 9
    mov dl, 0
    int 10h
    
    mov cx, 26
    mov dl, 'a'
    mov bh, 'Z'
    mov bl, ' '
    
y2:
    int 21h
    mov dh, dl
    inc dh
    mov dl, bh
    int 21h
    dec bh
    mov dl, bl
    int 21h
    mov dl, dh
    loop y2
    jmp menuloop
    
menuback:
    jmp menuloop
    
con4t:
    jmp con4
    
exit1:
    jmp exit
    
con3:
    mov ah, 02h
    mov bh, 00h
    mov dh, 9
    mov dl, 0
    int 10h
    
    mov cx, 26
    mov dl, 'Z'
    mov bh, 'A'
    mov bl, ' '
    
y3:
    int 21h
    mov dh, dl
    dec dh
    mov dl, bh
    int 21h
    inc bh
    mov dl, bl
    int 21h
    mov dl, dh
    loop y3
    jmp menuloop
    
    
con4:
    mov ah, 02h
    mov bh, 00h
    mov dh, 12
    mov dl, 0
    int 10h
    
    mov ah, 09h
    mov dx, offset clearline
    int 21h
    
    mov ah, 02h
    mov bh, 00h
    mov dh, 11
    mov dl, 0
    int 10h
    
    mov ah, 09h
    mov dx, offset ltinput
    int 21h

    mov ah, 01h
    int 21h
    mov bh, al

    mov dl, 10
    mov ah, 02h
    int 21h
    mov dl, 13
    mov ah, 02h
    int 21h
    
    mov cx, 26
    mov ah, 02h
    
y4:
    mov dl, bh
    int 21h
    inc bh
    cmp bh, 'Z'
    jg menuback

    loop y4
    
exit:

mov ah, 4ch
int 21h
end cbrf