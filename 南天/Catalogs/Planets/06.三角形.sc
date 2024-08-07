// Object * del TrA  ---  Star  ---  OID=@3413405   (@@68253,7)  ---  coobox=22315 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Remove "DEL TrA A" {ParentBody "DEL TrA"}
Remove "DEL TrA B" {ParentBody "DEL TrA"} // B可能是光学伴星

// Object * eps TrA  ---  High Proper Motion Star  ---  OID=@3381155   (@@67909,0)  ---  coobox=22131 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source 
Star "EPS TrA A"
{
	DateUpdated     "2024-08-02"
	ParentBody      "EPS TrA"
	Class           "K1III"
	AbsMagn         -0.16
	MassSol         1 // 2
	RadSol          16.2
	LumBol          91
	Teff            4436

	BinaryOrbit     
	{
		Epoch           2455197      
		Separation      5388.37055769156 // 81.9 asec
		PositionAngle   220
	}
}

// Object HD 138510  ---  Star  ---  OID=@3381154   (@@67908,22)  ---  coobox=22131 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "HD 138510/Gaia DR3 5823955694698562816/TIC 263315097/CCDM J15367-6620B/CD-65 1971/CPC 21 3532/CPD-65 3101/GSC 09034-03744/IDS 15276-6559 B/PPM 780566/TYC 9034-3744-1/uvby98 100138510/2MASS J15363448-6620041/WDS J15367-6619B/** DUN 188B/GEN# +1.00138510/Gaia DR2 5823955694698562816"
{
	DateUpdated     "2024-08-02"
	ParentBody      "EPS TrA"
	Parallax        1.2433
	AppMagn         9.32
	Class           "A8IV" // A8/F0IV/V
	AbsMagn         -0.21 // 计算的值
}

// Object * kap01 Aps  ---  Be Star  ---  OID=@3347538   (@@68630,6)  ---  coobox=22209 
// Object types: Be Star,Emission-line Star,Double or Multiple Star,Near-IR Source (λ < 3 µm),Variable Star,Star,Infra-Red Source,UV-emission Source 
Remove "KAP1 Aps A" {ParentBody "KAP1 Aps"}
Remove "KAP1 Aps B" {ParentBody "KAP1 Aps"}
Star "KAP1 Aps A"
{
	DateUpdated     "2024-08-02"
	ParentBody      "HIP 76013"
	Class           "B2Vnpe"
	AbsMagn         -2.47
	MassSol         12.0
	Radius          2308692.93992301 // 计算的值
	LumBol          2120
	Teff            21500
	Age             0.0056

	BinaryOrbit     
	{
		PeriodDays      0.6
	}
}

Star "KAP1 Aps B"
{
	ParentBody      "HIP 76013"
	Class           "A1.2?"
}