// Object * iot01 Cyg  ---  Star  ---  OID=@247786   (@@10356,12)  ---  coobox=312 
// Object types: Near-IR Source (λ < 3 µm),Star,UV-emission Source 
Star "IOT1 Cyg A"
{
	DateUpdated     "2024-06-10"
	ParentBody      "IOT1 Cyg"
	Class           "A1V"
	AbsMagn         0.57
	MassSol         2.59
	Radius          2127964.62733129 // 计算的值
	LumBol          74.1
	Teff            9683
	Age             0.404

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   199.277444
		Eccentricity    0.393835005
		Inclination     1.02529526
		AscendingNode   0
		ArgOfPericenter 152.86188
		MeanAnomaly     -141.579809
	}
}

Star "IOT1 Cyg B"
{
	ParentBody      "IOT1 Cyg"
	Class           "G1.4?"
}

// Object * 33 Cyg  ---  High Proper Motion Star  ---  OID=@216865   (@@9653,0)  ---  coobox=395 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Variable Star,Star,Infra-Red Source,UV-emission Source 
Star "33 Cyg A"
{
	DateUpdated     "2024-06-10"
	ParentBody      "33 Cyg"
	Class           "A3IV-Vn"
	AbsMagn         0.84
	MassSol         2.33
	RadSol          2.76
	LumBol          44.3
	Teff            8395
	Age             0.400
	Oblateness      0.21875 // Vsini = 243 Km/s
}
